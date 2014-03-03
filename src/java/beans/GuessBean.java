/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.io.Serializable;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import model.GuessExpert;

/**
 *
 * @author User
 */
@ManagedBean
@RequestScoped
@Named("guessBean")
public class GuessBean implements Serializable{
    
    private static final long serialVersionUID = 1;
    
    Random rand = new Random();

    private int random = rand.nextInt(100) + 1;

    private int guess;
    private String guessResult;
    private String hint = "";
    @Inject
    private GuessExpert expert;
    /**
     * Creates a new instance of GuessBean
     */
    public GuessBean() {
    }

    public String getNumberHint(String guessResult) {
        hint = expert.getHintMessage(guessResult);
        return "index"; // name of destination page
    }
    
    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getGuessResult() {
        if (guess < random){
            guessResult = "low";
        }else if (guess > random){
            guessResult = "high";
        }else if (guess == random){
            guessResult = "right";
        }
        return guessResult;
    }

    public void setGuessResult(String guessResult) {
        this.guessResult = guessResult;
    }
    
}
