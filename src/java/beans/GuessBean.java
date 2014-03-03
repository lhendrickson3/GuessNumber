/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.io.Serializable;
import java.util.Random;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import model.GuessExpert;

/**
 *
 * @author User
 */

@Named("guessBean")
@SessionScoped

public class GuessBean implements Serializable{
    
    private static final long serialVersionUID = 1;
    
//    Random rand = new Random();
//
//    private int random = rand.nextInt(100) + 1;

    private int guess;
    private String hint = "";
    @Inject
    private GuessExpert expert;
    /**
     * Creates a new instance of GuessBean
     */
    public GuessBean() {
    }

    public String getNumberHint() {
        hint = expert.getHintMessage(guess);
        return "index"; // name of destination page
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
    
}
