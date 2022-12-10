package com.haselby.aoc2022.day2.part2;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PuzzleInputTest {
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
    @DisplayName("readIntoListOfCharacters - passing example input file - should not throw exception")
    void readIntoListOfIntegers_ExampleInputFile_ShouldNotThrowException() {
        assertDoesNotThrow(() -> PuzzleInput.readIntoListOfCharacters("test-input-d2p1-01.txt"));
    }

    @Test
    @DisplayName("readIntoListOfIntegers - passing missing input file - should throw exception")
    void readIntoListOfIntegers_MissingInputFile_ThrowsException() {
        assertThrows(IOException.class, () -> PuzzleInput.readIntoListOfCharacters("missing-file.txt"));

    }

    @Test
    @DisplayName("readInto2DListOfCharacters - passing example input file - returns expected list of Characters")
    void readInto2DListOfCharacters_ExampleInputFile_ReturnsExpectedListOfCharacters() {

        ArrayList<ArrayList<Character>> puzzleInputTest01 = new ArrayList<>();

        try {
            puzzleInputTest01 = PuzzleInput.readIntoListOfCharacters("test-input-d2p1-01.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Validate Te
        //  A Y
        //  B X
        //  C Z

        assertEquals('A', puzzleInputTest01.get(0).get(0));
        assertEquals('Y', puzzleInputTest01.get(0).get(1));

        assertEquals('B', puzzleInputTest01.get(1).get(0));
        assertEquals('X', puzzleInputTest01.get(1).get(1));

        assertEquals('C', puzzleInputTest01.get(2).get(0));
        assertEquals('Z', puzzleInputTest01.get(2).get(1));


    }


}
