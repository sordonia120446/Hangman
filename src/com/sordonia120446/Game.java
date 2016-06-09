package com.sordonia120446;
/**
 * Created by SamO on 6/6/16.
 */
public class Game {
    public static final int MAX_MISSES = 7;
    private String mAnswer;
    private String mHits;
    private String mMisses;

    public Game(String answer) {
        mAnswer = answer;
        mHits = "";
        mMisses = "";
    }

    public String getCurrentProgress() {
        String progress = "";
        for ( char letter: mAnswer.toCharArray() ) {
            char display = '-';
            if (mHits.indexOf(letter) >= 0) {
                display = letter;
            }
            progress += display;
        }
        return progress;
    }

    public int getRemainingMisses() {
        return MAX_MISSES - mMisses.length();
    }

    public boolean hasWon() {
        if (getCurrentProgress().equalsIgnoreCase(mAnswer)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean applyGuess(char letter) {
        boolean isHit = mAnswer.indexOf(letter) >= 0;
        if (isHit) {
            mHits += letter;
            System.out.println("You have chosen...wisely");
        }
        else {
            mMisses += letter;
            System.out.println("You have chosen...poorly....");
        }
        return isHit;
    }
}
