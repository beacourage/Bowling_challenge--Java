package com.company;

import java.util.ArrayList;

public class FullGame {

    private static ArrayList<Object> frames;


    public FullGame() {
        this.frames = new ArrayList<Object>();
     }

    public static ArrayList<Object> getFrames() {
        return frames;
    }

    public void all_frames(int roll1, int roll2) {
       for (int i=0; i<10; i++) {
           getFrames().add(roll1);
           getFrames().add(roll2);
       }
    }


}

//    Calculate Scores for Ten Pin Bowling -- total game score
//    Game consists of 10 frames each with 1 or 2 rolls [1,2]

//Bonus is the next two rolls (next frame), unless the player rolls another strike.
// if player rolls another strike at (i+2), then it goes into following frame.
//    special condition for 10th frame.







