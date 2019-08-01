package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class FramesTest {

    private Frames frames;

    @Before
    public void setup() {
        frames = new Frames();
    }



    @DisplayName("Creates frames for a normal game")
    @Test
    public void createsFrames() {
        frames.all_frames(2,3);
        assertEquals(2, frames.getFrames().get(0));
        assertEquals(3, frames.getFrames().get(19));
    }


    @DisplayName("Creates frames - includes extra frames")
    @Test
    public void bonusGameCreatesFrames() {
        frames.all_frames(2,3);
        frames.getFrames().add(7);
        assertEquals(7, frames.getFrames().get(20));
    }


}