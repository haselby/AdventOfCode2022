package com.haselby.aoc2022.day2.part2;

import java.io.IOException;
import java.util.ArrayList;

public class Puzzle {

    public static void main(String[] args) {
        System.out.println("Hello Day2, Part1");

        ArrayList<ArrayList<Character>> puzzleInput = new ArrayList<>();

        //Read puzzle input located in folder: /scr/main/resources
        try {
            puzzleInput = PuzzleInput.readIntoListOfCharacters("input.txt");
            System.out.println("Puzzle input read successfully");
        } catch (IOException e) {
            System.out.println("Puzzle input is missing. Closing application");
            e.printStackTrace();
            System.exit(0);
        }

        StrategyGuide strategyGuide = new StrategyGuide(puzzleInput);

        int scoreIfFollowedStrategyGuide = strategyGuide.calculateScore();

        System.out.println("Your score if you followed the strategy guide exactly: " + scoreIfFollowedStrategyGuide);







    }
}
