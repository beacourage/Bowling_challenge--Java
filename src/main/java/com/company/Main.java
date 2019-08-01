package com.company;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Frames myframe = new Frames();
        FullGame game = new FullGame(myframe);


        myframe.all_frames(2,3);
        myframe.getFrames().add(2);

        System.out.println(myframe.getFrames());


        System.out.println(game.getScore());










//        DO NOT GENERATE RANDOM ROLLS. THE USER INPUTS THE ROLLS.

//
//        FullGame game = new FullGame();
//        game.all_frames(3, 7);
//        game.getFrames().add(2);
//        System.out.println(game.getFrames());
//        System.out.println(game.getFrames().size());
//        System.out.println(game.getScore());
//
//
////        game.getting_every_second_element();
//
//        System.out.println(game.getSpareBonus());
//
//         FullGame newGame = new FullGame();
//         newGame.all_frames(10,0);
//         newGame.getFrames().addAll(Arrays.asList(10,0,10,0));
//
//        System.out.println(newGame.getFrames());
//
//        System.out.println(newGame.totalScore());
//
//
//        FullGame nextGame = new FullGame();
//
//        nextGame.getFrames().addAll(Arrays.asList(3,7,10,0,3,7,2,2,10,0,3,3,6,6,3,9,10,0,2,2));
//

    }


}

