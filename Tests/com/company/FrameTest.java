package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runners.model.FrameworkField;

import static org.junit.Assert.*;

public class FrameTest {

    private Frame frame;


    @Before
    public void setup() {
        frame = new Frame();

    }

    @DisplayName("Test")
    @Test
    public void firstTest() {
        assertEquals(2,2);
    }




}