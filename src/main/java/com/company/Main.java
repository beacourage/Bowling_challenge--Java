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
        System.out.println(game.total_game_score());


//        game.getting_every_second_element();

        System.out.println(game.getSpareBonus());

         FullGame newGame = new FullGame();
         newGame.all_frames(10,0);
         newGame.getFrames().addAll(Arrays.asList(10,0,10,0));
        System.out.println(newGame.getFrames());
        System.out.println(newGame.getStrikeBonus());
















//
//
//
//          AllFrames allframes = new AllFrames(1,4,4,5,6,4,5,5,10,0,0,1,7,3,6,4,10,0,8,8);
//
//          Game mygame = new Game();
//
//           System.out.println(mygame.getScore());
//
//        AllFrames allframes = new AllFrames(1,4,4,5,6,4,5,5,10,0,0,1,7,3,6,4,10,0,8,8);
//


    }


}

