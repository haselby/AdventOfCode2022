package com.haselby.aoc2022.day2.part1;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    @DisplayName("readIntoListOfIntegers - passing example input file - returns expected list of Integers")
    void readIntoListOfIntegers_ExampleInputFile_ReturnsExpectedListOfIntegers() {
        List<Character> puzzleInputTest01 = new ArrayList<>();

        try {
            puzzleInputTest01 = PuzzleInput.readIntoListOfCharacters("test-input-d2p1-01.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals('A', puzzleInputTest01.get(0));


    }


}
