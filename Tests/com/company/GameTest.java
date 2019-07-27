package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class GameTest {

    private Game game;

    @Before
    public void setup() {

        game = new Game();
    }


    @DisplayName("Score calculated from firstFrame")
    @Test
    public void firstFrame() {
        AllFrames allframes = new AllFrames(1,4,4,5,6,4,5,5,10,0,0,1,7,3,6,4,10,0,8,8);
        assertEquals(5, game.getScore());
    }

    @Test
    public void firstFrameStrike() {
        AllFrames allframes = new AllFrames(2,10,4,5,6,4,5,5,10,0,0,1,7,3,6,4,10,0,8,8);
        assertEquals(21, game.getScore());
    }

    @Test
    public void firstFramesSpare() {
        AllFrames allframes = new AllFrames(3,7,4,5,6,4,5,5,10,0,0,1,7,3,6,4,10,0,8,8);
        assertEquals(14, game.getScore());
    }



}