/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.inject.Named;

/**
 *
 * @author User
 */
public class GuessExpert implements Serializable{
    private static final long serialVersionUID = 1;
    
    public String getHintMessage(String guessResult){
        String hint = "";
        
        if (guessResult.equals("low")){
            hint = "Guess Higher!";
        } else if (guessResult.equals("high")){
            hint = "Guess Lower!";
        } else if (guessResult.equals("right")){
            hint = "Congratulations! You have guessed correctly!";
        }
        return hint;
    }
}
