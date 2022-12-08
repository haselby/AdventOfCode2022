package com.haselby.aoc2022.day1.part1;

import java.io.IOException;
import java.util.ArrayList;

public class Puzzle {
    public static void main(String[] args) {
        System.out.println("Hello Day1, Part1");

        ArrayList<Integer> puzzleInput = new ArrayList<>();

        //Read puzzle input located in folder: /scr/main/resources
        try {
            puzzleInput = PuzzleInput.readIntoListOfIntegers("input.txt");
            System.out.println("Puzzle input read successfully");
        } catch (IOException e) {
            System.out.println("Puzzle input is missing. Closing application");
            e.printStackTrace();
            System.exit(0);
        }

        FoodInventory foodInventory = new FoodInventory(puzzleInput);
        int maxCaloriesHeldByElf = foodInventory.searchMaxCaloriesHeldByElf();
        System.out.println("Max calories held by individual elf: " +  maxCaloriesHeldByElf);

    }
}
