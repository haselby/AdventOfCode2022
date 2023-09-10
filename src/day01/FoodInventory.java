package day01;

import java.util.ArrayList;
import java.util.Collections;

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

    public int searchMaxCaloriesHeldByElves(int numberOfElves) {
        ArrayList<Integer> sumOfCalories = new ArrayList<>();

        int index = 0;
        for (Integer calories : listOfCalories) {
            if (calories == null) {
                // null value indicates boundary between Elves
                index++;

            } else {
                if (index >= sumOfCalories.size()) {
                    // start a new sum
                    sumOfCalories.add(index, calories);
                } else {
                    // add to existing sum
                    sumOfCalories.set(index, sumOfCalories.get(index) + calories);
                }
            }
        }

        // highest values at beginning of list
        sumOfCalories.sort(Collections.reverseOrder());

        int totalCaloriesFromTopElves = 0;

        for (int i = 0; i < numberOfElves; i++) {
            totalCaloriesFromTopElves += sumOfCalories.get(i);
        }

        return totalCaloriesFromTopElves;
    }


}
