package day01;

import java.io.IOException;
import java.util.ArrayList;

public class SecondPuzzle {
        public static void main(String[] args) {
        System.out.println("Starting Day 1, Puzzle 2");

        ArrayList<Integer> puzzleInput = new ArrayList<>();

        // Read puzzle input located in folder: /resources
        try {
            puzzleInput = PuzzleInput.readIntoListOfIntegers("input_day01.txt");
            System.out.println("Puzzle input read successfully");
        } catch (IOException e) {
            System.out.println("Puzzle input is missing. Closing application");
            e.printStackTrace();
            System.exit(0);
        }

        FoodInventory foodInventory = new FoodInventory(puzzleInput);
        int maxCaloriesHeldByElf = foodInventory.searchMaxCaloriesHeldByElves(1);
        System.out.println("Max calories held by individual elf: " +  maxCaloriesHeldByElf);

        int totalCaloriesHeldByTopThreeElves = foodInventory.searchMaxCaloriesHeldByElves(3);
        System.out.println("Total calories held by top three elves: " +  totalCaloriesHeldByTopThreeElves);

    }
}
