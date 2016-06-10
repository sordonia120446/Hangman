package com.sordonia120446;
/**
 * Created by SamO on 6/6/16.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Game game = new Game("foo");
        Prompter prompter = new Prompter(game);
        prompter.play();
    }
}
