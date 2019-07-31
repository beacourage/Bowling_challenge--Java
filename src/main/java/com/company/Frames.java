package com.company;

import java.util.ArrayList;

public class Frames {

    private static ArrayList<Object> frames;


    public  Frames() {
        this.frames = new ArrayList<Object>();
    }


    public  ArrayList<Object> getFrames() {
        return frames;
    }


    public  void all_frames(int roll1, int roll2) {
        for (int i=0; i<10; i++) {
            getFrames().add(roll1);
            getFrames().add(roll2);
        }
    }


}
