package day02;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StrategyGuideTest {
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
        ArrayList<ArrayList<Character>> parsedPuzzleInput = new ArrayList<>();

        try {
            PuzzleInput puzzleInput = new PuzzleInput();
            parsedPuzzleInput = puzzleInput.readIntoListOfCharacters("input_day02-01.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        StrategyGuide strategyGuide = new StrategyGuide(parsedPuzzleInput);

        assertEquals(15, strategyGuide.calculateScore());

    }

}