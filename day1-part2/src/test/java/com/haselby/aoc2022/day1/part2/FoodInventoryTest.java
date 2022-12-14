package com.haselby.aoc2022.day1.part2;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodInventoryTest {

    @BeforeAll
    static void beforeAll() {

    }

    @BeforeEach
    void beforeEach() {

    }

    @AfterEach
    void afterEach() {

    }

    @AfterAll
    static void afterAll() {

    }

    @Test
    @DisplayName("searchMaxCaloriesHeldByElf - passing example input file - returns expected list of Integers")
    void searchMaxCaloriesHeldByElf_ExampleInputFile_ReturnsExpectedNumberOfCalories() {
        ArrayList<Integer> puzzleInputTest01 = new ArrayList<>();

        try {
            puzzleInputTest01 = PuzzleInput.readIntoListOfIntegers("test-input-d1p1-01.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        FoodInventory foodInventoryTest = new FoodInventory(puzzleInputTest01);



        assertEquals(24000, foodInventoryTest.searchMaxCaloriesHeldByElves(1));


    }

    @Test
    @DisplayName("searchMaxCaloriesHeldByTopThreeElves - passing example input file - returns expected list of Integers")
    void searchMaxCaloriesHeldByTopThreeElves_ExampleInputFile_ReturnsExpectedNumberOfCalories() {
        ArrayList<Integer> puzzleInputTest01 = new ArrayList<>();

        try {
            puzzleInputTest01 = PuzzleInput.readIntoListOfIntegers("test-input-d1p1-01.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        FoodInventory foodInventoryTest = new FoodInventory(puzzleInputTest01);



        assertEquals(45000, foodInventoryTest.searchMaxCaloriesHeldByElves(3));


    }
}
