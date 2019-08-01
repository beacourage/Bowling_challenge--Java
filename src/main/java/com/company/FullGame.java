package com.company;

import java.util.ArrayList;


public class FullGame {

    private int score;
    private int spareBonus;
    private int strikeBonus;
    private Frames frames;

    public FullGame(Frames frame) {
        this.score = 0;
        this.spareBonus = 0;
        this.strikeBonus = 0;
         frames = frame;
     }


    public int getScore() {
        for (int i=0; i<20; i++) {
            score += (int)frames.getFrames().get(i);
        }
        return score;
    }



    public int getSpareBonus() {
        for (int i = 0; i < (frames.getFrames().size()  - 2); i += 2) {
            if (((int)frames.getFrames().get(i) + (int)frames.getFrames().get(i + 1) == 10 ) && ((int)frames.getFrames().get(i) != 10)) {
                spareBonus += (int)frames.getFrames().get(i+2);
            }
        }
        return spareBonus;
    }

    public int getStrikeBonus() {
        for (int i = 0; i < (frames.getFrames().size()  - 4); i += 2) {
            if (((int)frames.getFrames().get(i) == 10 )) {
                if ((int)frames.getFrames().get(i+2) == 10) {
                    strikeBonus += (int)frames.getFrames().get(i+2) + (int)frames.getFrames().get(i+4);
                } else
                    strikeBonus += (int)frames.getFrames().get(i+2) + (int)frames.getFrames().get(i+3);
            }
        }
        return strikeBonus;
    }


    public int totalScore() {
        getScore();
        getSpareBonus();
        getStrikeBonus();
        return (strikeBonus + spareBonus + score);
    }



}

//    Calculate Scores for Ten Pin Bowling -- total game score
//    Game consists of 10 frames each with 1 or 2 rolls [1,2]

//Bonus is the next two rolls (next frame), unless the player rolls another strike.
// if player rolls another strike at (i+2), then it goes into following frame.
//    special condition for 10th frame.







