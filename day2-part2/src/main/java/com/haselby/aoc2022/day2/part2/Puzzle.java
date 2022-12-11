package com.haselby.aoc2022.day2.part2;

import java.io.IOException;
import java.util.ArrayList;

public class Puzzle {

    public static void main(String[] args) {
        System.out.println("Hello Day2, Part2");

        ArrayList<ArrayList<Character>> myPuzzleInput = new ArrayList<>();

        PuzzleInput puzzleInput = new PuzzleInput();

        //Read puzzle input located in folder: /scr/main/resources
        try {
            myPuzzleInput = puzzleInput.readIntoListOfCharacters("input.txt");
            System.out.println("Puzzle input read successfully");
        } catch (IOException e) {
            System.out.println("Puzzle input is missing. Closing application");
            e.printStackTrace();
            System.exit(0);
        }

        StrategyGuide strategyGuide = new StrategyGuide(myPuzzleInput);

        int scoreIfFollowedStrategyGuide = strategyGuide.calculateScore();

        System.out.println("Your score if you followed the strategy guide exactly: " + scoreIfFollowedStrategyGuide);







    }
}
