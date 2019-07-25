package com.company;

import java.util.ArrayList;

public class FullGame {

    private ArrayList<Object> frames;

    public FullGame() {
        this.frames = new ArrayList<Object>();
    }


    public ArrayList<Object> getFrames() {
        return frames;
    }


    public void all_frames(int roll1, int roll2) {
       for (int i=0; i<10; i++) {
           getFrames().add(roll1);
           getFrames().add(roll2);
       }
    }

    public int total_game_score() {
       int score = 0;
        for (int i=0; i<20; i++) {
            score += (int) getFrames().get(i);
        }
        return score;
    }

}














//    Calculate Scores for Ten Pin Bowling -- total game score
//    Game consists of 10 frames each with 1 or 2 rolls [1,2]





