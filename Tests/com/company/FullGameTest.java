package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FullGameTest {


    private FullGame game;
    private Frames frame;


    @Before
    public void setup() {
        game = new FullGame();

    }

    @DisplayName("Calculates the score from a gutter game - 20 zero scores")
    @Test
    public void gutterGame() {
//        frame.all_frames(0,0);
        int score = game.getScore();
        assertEquals(0,score);
    }

//moquito


//
//
//    @DisplayName("Calculates the total sparebonus")
//    @Test
//    public void spareBonus1() {
//        game.all_frames(3, 7);
//        game.getFrames().add(2);
////  [3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 2]
//        assertEquals(29, game.getSpareBonus());
//    }
//
//    @Test
//    public void spareBonus2() {
//        game.getFrames().addAll(Arrays.asList(3,7,2,2,3,7,2,2,3,7,3,3,6,6,3,9,3,7,2,2));
//         assertEquals(9,game.getSpareBonus());
//    }
//
//
//    @DisplayName("Calculates the strikebonus")
//    @Test
//    public void strikeBonus() {
//        game.getFrames().addAll(Arrays.asList(3,7,10,0,3,7,2,2,10,0,3,3,6,6,10,0,3,7,2,2));
//        assertEquals(26, game.getStrikeBonus());
//    }
//
//    @DisplayName("Calculates the strikebonus if player rolls two strikes in a row")
//    @Test
//    public void multipleStrikeBonus() {
//        game.all_frames(10,0);
//        game.getFrames().addAll(Arrays.asList(10,0,10,0));
//        assertEquals(200, game.getStrikeBonus());
//    }
//
//
//
//    @DisplayName("Calculates total game score, adding score, strikebonus, sparebonuys")
//    @Test
//    public void perfectGame() {
//        game.all_frames(10,0);
//        game.getFrames().addAll(Arrays.asList(10,0,10,0));
//        assertEquals(300, game.totalScore());
//    }
//
//
//    @DisplayName("Calculates total score from a normal game")
//    @Test
//    public void normalGame() {
//        game.getFrames().addAll(Arrays.asList(1,4,4,5,6,4,5,5,10,0,0,1,7,3,6,4,10,0,2,8,6));
//        assertEquals(133, game.totalScore());
//    }


