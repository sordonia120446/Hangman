package com.sordonia120446;
import java.util.Scanner;
/**
 * Created by SamO on 6/6/16.
 */
public class Prompter {
    private Game mGame;

    public Prompter(Game game) {
        mGame = game;
    }

    public void displayProgress() {
        System.out.printf("You have %d tries left to solve  %s\n",
                mGame.getRemainingMisses(),
                mGame.getCurrentProgress());
    }

    public void play() {
        /*
        Here's where all the magic happens.  Displays the progress
        of the player, prompts for a guess at the next letter, and updates.
        */
        while ( mGame.getRemainingMisses() > 0 ) {
            displayProgress();
            promptForGuess();
            if (mGame.hasWon()) {
                System.out.println("\nYou have won!");
                System.out.printf("The word is %s",mGame.getCurrentProgress());
                break;
            }
        }
    }

    public boolean promptForGuess() {
        /*
        Takes in user input.  Input is class String, even when inputting a "number."
        Convert user input to first letter as char to pass into the applyGuess() method
        in the Game class.
        */
        Scanner reader = new Scanner(System.in);
        System.out.println("Guess a letter:  ");
        String guess = reader.next();

        char letterGuess = guess.charAt(0);
        return mGame.applyGuess(letterGuess);

    }
}
