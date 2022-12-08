package com.haselby.aoc2022.day1.part1;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@DisplayName("Day 1, Part 1 - PuzzleInput Test")
public class PuzzleInputTest {
//    @BeforeAll
//    static void beforeAll() {
//        System.out.println("Before all test methods");
//    }
//
//    @BeforeEach
//    void beforeEach() {
//        System.out.println("Before each test method");
//    }
//
//    @AfterEach
//    void afterEach() {
//        System.out.println("After each test method");
//    }
//
//    @AfterAll
//    static void afterAll() {
//        System.out.println("After all test methods");
//    }

    @Test
    @DisplayName("First test")
    void firstTest() {
        System.out.println("First test method");
        List<Integer> puzzleInputTest01 = new ArrayList<>();
        try {
            puzzleInputTest01 = PuzzleInput.readIntoListOfIntegers("test-input-01.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(puzzleInputTest01);
    }

    @Test
    @DisplayName("Second test")
    void secondTest() {
        System.out.println("Second test method");
    }
}
