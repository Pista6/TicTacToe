/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rules;

import javax.swing.JButton;

/**
 *
 * @author Stefan
 */
public class GameRules {

    private JButton[] buttons;
    public Player current;
    private Player p1;
    private Player p2;
    

    
    public GameRules(JButton[] buttons, Player p1, Player p2){
        this.buttons = buttons;
        this.current = p1;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    
    public boolean move(JButton button){
        boolean playerState = false;
        
        if(current == null){
            current = p1;
        }
        else{
            if(button.getText().equals(" ")){
                button.setText(current.getSign().toString());   // change move on UI
                System.out.println(this.current.getName() + " Made move. ");
                if(isWin()) return true; // checking if player win in this move
                if(current.getSign().equals(SignEnum.X)){   //change player after every move
                    current = p2;   
                }else{
                    current = p1;
                }
            }else{
                System.out.println("Bad move.");
            }
        }
        return playerState;
    }
        
    public boolean isWin(){
        
        for(int i = 0; i < 9; i += 3){  //checking if player win in lines
                if(buttons[i].getText().equals(buttons[i+1].getText())){
                    if(buttons[i].getText().equals(buttons[i+2].getText()))
                        if(!buttons[i].getText().equals(" ")) return true;
                }
        }
        for(int i = 0; i < 3; i++){ //checking if player win in columns
                if(buttons[i].getText().equals(buttons[i+3].getText())){
                    if(buttons[i].getText().equals(buttons[i+6].getText()))
                        if(!buttons[i].getText().equals(" ")) return true;
                }
        }
        if(buttons[0].getText().equals(buttons[4].getText())){ //checking if player won on [\] diagonal
                    if(buttons[0].getText().equals(buttons[8].getText()))
                        if(!buttons[0].getText().equals(" ")) return true;
        }
        if(buttons[2].getText().equals(buttons[4].getText())){  //checking if player won on [\] diagonal
                    if(buttons[2].getText().equals(buttons[6].getText()))
                        if(!buttons[2].getText().equals(" ")) return true;
        }
        return false;
    }
    

}

