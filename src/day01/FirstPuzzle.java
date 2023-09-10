package day01;

import java.io.IOException;
import java.util.ArrayList;

public class FirstPuzzle {

        public static void main(String[] args) {
        System.out.println("Starting Day 1, Puzzle 1");

        ArrayList<Integer> puzzleInput = new ArrayList<>();

        //Read puzzle input located in folder: /resources
        try {
            puzzleInput = PuzzleInput.readIntoListOfIntegers("input_day01.txt");
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
