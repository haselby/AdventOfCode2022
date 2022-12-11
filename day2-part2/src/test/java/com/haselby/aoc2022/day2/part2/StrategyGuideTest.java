package com.haselby.aoc2022.day2.part2;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyGuideTest {
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
    @DisplayName("calculateScore - passing example input file - returns expected score")
    void calculateScore_ExampleInputFile_ReturnsExpectedScore() {
        ArrayList<ArrayList<Character>> puzzleInputTest01 = new ArrayList<>();

        try {
            PuzzleInput puzzleInput = new PuzzleInput();
            puzzleInputTest01 = puzzleInput.readIntoListOfCharacters("test-input-d2p1-01.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        StrategyGuide strategyGuide = new StrategyGuide(puzzleInputTest01);

        assertEquals(12, strategyGuide.calculateScore());

    }

}
