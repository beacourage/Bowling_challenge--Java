package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FullGameTest {


    private FullGame game;


    @Before
    public void setup() {
        game = new FullGame();

    }

    @DisplayName("Calculates the score from a gutter game - 20 zero scores")
    @Test
    public void gutterGame() {
        game.all_frames(0,0);
        int score = game.total_game_score();
        assertEquals(0,score);
    }



    @DisplayName("Calculates the total sparebonus")
    @Test
    public void spareBonus1() {
        game.all_frames(3, 7);
        game.getFrames().add(2);
//  [3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7, 2]
        assertEquals(29, game.getSpareBonus());
    }

    @Test
    public void spareBonus2() {
        game.getFrames().addAll(Arrays.asList(3,7,2,2,3,7,2,2,3,7,3,3,6,6,3,9,3,7,2,2));
         assertEquals(9,game.getSpareBonus());
    }





}