package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

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




}