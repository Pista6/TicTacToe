/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictacgame;

import UI.GameFrame;

/**
 *
 * @author Stefan
 */
public class TicTacGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GameFrame game = new GameFrame();
        game.setDefaultCloseOperation(game.EXIT_ON_CLOSE);
        game.setLocationRelativeTo(null);
        game.setVisible(true);
        
    }
    
}
