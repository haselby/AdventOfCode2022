package com.haselby.aoc2022.day2.part2;

import java.io.IOException;
import java.util.ArrayList;

public class Puzzle {

    public static void main(String[] args) {
        System.out.println("Puzzle -  Day2, Part2");

        ArrayList<ArrayList<Character>> parsedPuzzleInput = new ArrayList<>();

        // Read puzzle input located in folder: /scr/main/resources
        PuzzleInput puzzleInput = new PuzzleInput();
        try {
            parsedPuzzleInput = puzzleInput.readIntoListOfCharacters("input.txt");
            System.out.println("Puzzle input read successfully");
        } catch (IOException e) {
            System.out.println("Puzzle input is missing. Closing application");
            e.printStackTrace();
            System.exit(0);
        }

        StrategyGuide strategyGuide = new StrategyGuide(parsedPuzzleInput);

        int scoreIfFollowedStrategyGuide = strategyGuide.calculateScore();

        System.out.println("Your score if you followed the strategy guide exactly: " + scoreIfFollowedStrategyGuide);

    }
}
