package day01;

import java.io.IOException;
import java.util.ArrayList;

public class FirstPuzzle {

        public static void main(String[] args) throws IOException {
            System.out.println("Starting Day 1, Puzzle 1");
            ArrayList<Integer> puzzleInput = PuzzleInput.readIntoListOfIntegers("input_day01.txt");
            FoodInventory foodInventory = new FoodInventory(puzzleInput);
            int maxCaloriesHeldByElf = foodInventory.searchMaxCaloriesHeldByElf();
            System.out.println("Max calories held by individual elf: " +  maxCaloriesHeldByElf);
        }
}
