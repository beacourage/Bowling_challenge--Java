package com.company;

import java.util.ArrayList;

public class FullGame {

    private ArrayList<Object> frames;
    private int score;
    private int spareBonus;
    private int strikeBonus;

    public FullGame() {
        this.frames = new ArrayList<Object>();
        this.score = 0;
        this.spareBonus = 0;
        this.strikeBonus = 0;
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
             for (int i=0; i<getFrames().size(); i++) {
                 score += (int) getFrames().get(i);
             }
        return score;
    }

    public void getting_every_second_element() {
        for (int i = 0; i < getFrames().size(); i+= 2) {
            System.out.println("First roll is " + getFrames().get(i));
        }
    }

    public int getSpareBonus() {
        for (int i = 0; i < (getFrames().size()  - 2); i += 2) {
            if ((int)getFrames().get(i) + (int)getFrames().get(i + 1) == 10 ){
                spareBonus += (int)getFrames().get(i+2);
            }
        }
        return spareBonus;
    }

    public int getStrikeBonus() {
        for (int i = 0; i < (getFrames().size()  - 2); i += 2) {
            if (((int)getFrames().get(i) == 10 ) || ((int)getFrames().get(i+1) == 10)) {
                strikeBonus += (int)getFrames().get(i+2);
                strikeBonus += (int)getFrames().get(i+3);
            }
        }
        return strikeBonus;
    }


//Want to make an arraylist but pair the integers.




}














//    Calculate Scores for Ten Pin Bowling -- total game score
//    Game consists of 10 frames each with 1 or 2 rolls [1,2]





