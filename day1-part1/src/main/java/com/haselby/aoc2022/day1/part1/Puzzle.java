package com.haselby.aoc2022.day1.part1;

import java.util.ArrayList;
import java.util.List;

public class Puzzle {
    public static void main(String[] args) {
        System.out.println("Hello Day1, Part1");

        List<Integer> puzzleInput = new ArrayList<>();

        //Read puzzle input located in folder: /scr/main/resources
        try {
            puzzleInput = PuzzleInput.readIntoListOfIntegers("input.txt");
            System.out.println("Puzzle input read successfully");
        } catch (Exception e) {
            System.out.println("Puzzle input is missing. Closing application");
            e.printStackTrace();
            System.exit(0);
        }

        for (Integer x : puzzleInput) {
            System.out.println(x);
        }

    }
}
