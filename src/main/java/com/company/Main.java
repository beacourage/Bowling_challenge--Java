package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


//        DO NOT GENERATE RANDOM ROLLS. THE USER INPUTS THE ROLLS.


        FullGame game = new FullGame();
        game.all_frames(3, 7);
        game.getFrames().add(2);
        System.out.println(game.getFrames());
        System.out.println(game.getFrames().size());
        System.out.println(game.getScore());


//        game.getting_every_second_element();

        System.out.println(game.getSpareBonus());

         FullGame newGame = new FullGame();
         newGame.all_frames(10,0);
         newGame.getFrames().addAll(Arrays.asList(10,0,10,0));
        System.out.println(newGame.getFrames());
        System.out.println(newGame.getStrikeBonus());
        System.out.println(newGame.getScore());
        System.out.println(newGame.totalGameScore());



        FullGame nextGame = new FullGame();

        nextGame.getFrames().addAll(Arrays.asList(3,7,10,0,3,7,2,2,10,0,3,3,6,6,3,9,10,0,2,2));


    }


}

