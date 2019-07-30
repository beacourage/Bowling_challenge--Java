package com.company;

public class Score {

    private int score;
    private int spareBonus;
    private int strikeBonus;


    public Score() {
        this.score = 0;
        this.spareBonus = 0;
        this.strikeBonus = 0;
    }


    public int getScore() {
        for (int i=0; i<20; i++) {
            score += (int)  FullGame.getFrames().get(i);
        }
        return score;
    }

    public int getSpareBonus() {
        for (int i = 0; i < (FullGame.getFrames().size()  - 2); i += 2) {
            if (((int)FullGame.getFrames().get(i) + (int)FullGame.getFrames().get(i + 1) == 10 ) && ((int)FullGame.getFrames().get(i) != 10)) {
                spareBonus += (int)FullGame.getFrames().get(i+2);
            }
        }
        return spareBonus;
    }

    public int getStrikeBonus() {
        for (int i = 0; i < (FullGame.getFrames().size()  - 4); i += 2) {
            if (((int)FullGame.getFrames().get(i) == 10 )) {
                if ((int)FullGame.getFrames().get(i+2) == 10) {
                    strikeBonus += (int)FullGame.getFrames().get(i+2) + (int)FullGame.getFrames().get(i+4);
                } else
                    strikeBonus += (int)FullGame.getFrames().get(i+2) + (int)FullGame.getFrames().get(i+3);
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
