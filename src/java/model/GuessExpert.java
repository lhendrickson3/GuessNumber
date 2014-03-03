/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import beans.GuessBean;
import java.io.Serializable;
import java.util.Random;
import javax.inject.Named;

/**
 *
 * @author User
 */
public class GuessExpert implements Serializable{
    private static final long serialVersionUID = 1;
    private String message;
    private GuessBean gb;
    
    Random rand = new Random();

    private int random = rand.nextInt(100) + 1;
    
    public String getHintMessage(int guess) {
        if (guess < random){
            message = "Guess Higher!";
        }else if (guess > random){
            message = "Guess Lower!";
        }else if (guess == random){
            message = "Congratulations! You have guessed correctly!";
        }
        return message;
    }
    
}
