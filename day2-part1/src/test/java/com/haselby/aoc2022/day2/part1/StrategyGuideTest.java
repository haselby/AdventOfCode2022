package com.haselby.aoc2022.day2.part1;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

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
            puzzleInputTest01 = PuzzleInput.readIntoListOfCharacters("test-input-d2p1-01.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        StrategyGuide strategyGuide = new StrategyGuide(puzzleInputTest01);



        assertEquals(15, strategyGuide.calculateScore());


    }

}
