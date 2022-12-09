package com.haselby.aoc2022.day1.part2;

import java.util.ArrayList;
import java.util.Collections;



public class FoodInventory {

    ArrayList<Integer> listOfCalories;

    FoodInventory(ArrayList<Integer> puzzleInput) {
        this.listOfCalories = puzzleInput;
    }

    public int searchMaxCaloriesHeldByElves(int numberOfElves) {
        // maxTotalCalories: index 0 - highest value; index 1 - second highest value; etc...
        ArrayList<Integer> maxTotalCalories = new ArrayList<>();

        // initialize list based on numberOfElves
        for ( int i = 0; i < numberOfElves; i++) {
            maxTotalCalories.add(0);
        }

        int sumOfCalories = 0;

        for (Integer caloriesPerItem : listOfCalories) {
            if (caloriesPerItem == null) {
                int maxValue = Math.max(sumOfCalories, maxTotalCalories.get(numberOfElves-1));
                // Strategy keep a sorted list of maxTotalCalories
                // The number of elements is this list will be restricted to the numberOfElves to be considered
                // The lowest value of maxTotalCalories will be held at the bottom of the list
                maxTotalCalories.set(numberOfElves-1, maxValue);
                Collections.sort(maxTotalCalories);
                sumOfCalories = 0;
            } else {
                sumOfCalories += caloriesPerItem;
            }
        }
        int maxTotalCaloriesByTopElves = 0;
        for (int i : maxTotalCalories ){
            maxTotalCaloriesByTopElves += i;
        }

        return maxTotalCaloriesByTopElves;
    }


}
