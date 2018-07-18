/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rules;

/**
 *
 * @author Stefan
 */
public class Player { // player entity, using Enum to specify player (name and sign)
    
    private String name;
    private SignEnum sign;
    
    public Player(String name, SignEnum sign){
        this.name = name;
        this.sign = sign;
        
    }
    
    public String getName(){  //getter and setter for player name
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
     public SignEnum getSign(){ //getter and setter for enumeration
        return this.sign;
    }
    public void setSign(SignEnum sign){
        this.sign = sign;
    }
}
