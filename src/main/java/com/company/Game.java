package com.company;

public class Game {

    private int score;

    public Game() {
        this.score = 0;
    }


    public int getScore() {

        if ((AllFrames.getFrame1_1() == 10) || (AllFrames.getFrame1_2() == 10)) {
            score += 10 + AllFrames.getFrame2_1() + AllFrames.getFrame2_2();
        } else if (AllFrames.getFrame1_1() + AllFrames.getFrame1_2() == 10) {
            score += 10 + AllFrames.getFrame2_1();
        } else {
            score += AllFrames.getFrame1_1() + AllFrames.getFrame1_2();
        }
    return score;

    }


}