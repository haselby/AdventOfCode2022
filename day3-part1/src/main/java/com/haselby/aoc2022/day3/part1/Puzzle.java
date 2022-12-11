package com.haselby.aoc2022.day3.part1;

import java.io.IOException;
import java.util.ArrayList;

public class Puzzle {

    public static void main(String[] args) {
        System.out.println("Puzzle Day 3, Part 1");

        ArrayList<String> parsedPuzzleInput = new ArrayList<>();

        // Read puzzle input located in folder: /scr/main/resources
        PuzzleInput puzzleInput = new PuzzleInput();
        try {
            parsedPuzzleInput = puzzleInput.readIntoListOfStrings("input.txt");
            System.out.println("Puzzle input read successfully");
        } catch (IOException e) {
            System.out.println("Puzzle input is missing. Closing application");
            e.printStackTrace();
            System.exit(0);
        }

        System.out.println();
        System.out.println(parsedPuzzleInput.get(0));
        System.out.println(parsedPuzzleInput.get(1));
        System.out.println(parsedPuzzleInput.get(2));
        System.out.println(parsedPuzzleInput.get(0).length());
        System.out.println(parsedPuzzleInput.get(1).length());
        System.out.println(parsedPuzzleInput.get(2).length());
        System.out.println(parsedPuzzleInput.get(0).charAt(0));
        System.out.println(parsedPuzzleInput.get(1).charAt(0));
        System.out.println(parsedPuzzleInput.get(2).charAt(0));
        System.out.println();

        char[] myArrayOfChar = parsedPuzzleInput.get(0).toCharArray();

        for(char c : myArrayOfChar){
            System.out.println(c);
        }



    }
}
