package com.haselby.aoc2022.day1.part2;

import java.util.ArrayList;

public class FoodInventory {

    ArrayList<Integer> listOfCalories;

    FoodInventory(ArrayList<Integer> puzzleInput) {
        this.listOfCalories = puzzleInput;
    }

    public int searchMaxCaloriesHeldByElf() {
        int maxTotalCalories = 0;
        int sumOfCalories = 0;

        for (Integer caloriesPerItem : listOfCalories) {
            if (caloriesPerItem == null) {
                maxTotalCalories = Math.max(sumOfCalories, maxTotalCalories);
                sumOfCalories = 0;
            } else {
                sumOfCalories += caloriesPerItem;
            }
        }

        return maxTotalCalories;
    }


}
