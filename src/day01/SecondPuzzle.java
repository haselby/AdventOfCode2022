package day01;

import java.io.IOException;
import java.util.ArrayList;

public class SecondPuzzle {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting Day 1, Puzzle 2");
        ArrayList<Integer> puzzleInput = PuzzleInput.readIntoListOfIntegers("input_day01.txt");
        FoodInventory foodInventory = new FoodInventory(puzzleInput);
        int totalCaloriesHeldByTopThreeElves = foodInventory.searchMaxCaloriesHeldByElves(3);
        System.out.println("Total calories held by top three elves: " +  totalCaloriesHeldByTopThreeElves);
    }
}
