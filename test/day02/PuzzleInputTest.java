package day02;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class PuzzleInputTest {

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
        PuzzleInput puzzleInput = new PuzzleInput();
        assertDoesNotThrow(() -> puzzleInput.readIntoListOfCharacters("input_day02-01.txt"));
    }

    @Test
    @DisplayName("readIntoListOfIntegers - passing missing input file - should throw exception")
    void readIntoListOfIntegers_MissingInputFile_ThrowsException() {
        PuzzleInput puzzleInput = new PuzzleInput();
        assertThrows(IOException.class, () -> puzzleInput.readIntoListOfCharacters("missing-file.txt"));

    }

    @Test
    @DisplayName("readInto2DListOfCharacters - passing example input file - returns expected list of Characters")
    void readInto2DListOfCharacters_ExampleInputFile_ReturnsExpectedListOfCharacters() {

        ArrayList<ArrayList<Character>> parsedPuzzleInput = new ArrayList<>();

        try {
            PuzzleInput puzzleInput = new PuzzleInput();
            parsedPuzzleInput = puzzleInput.readIntoListOfCharacters("input_day02-01.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Validate Te
        //  A Y
        //  B X
        //  C Z

        assertEquals('A', parsedPuzzleInput.get(0).get(0));
        assertEquals('Y', parsedPuzzleInput.get(0).get(1));

        assertEquals('B', parsedPuzzleInput.get(1).get(0));
        assertEquals('X', parsedPuzzleInput.get(1).get(1));

        assertEquals('C', parsedPuzzleInput.get(2).get(0));
        assertEquals('Z', parsedPuzzleInput.get(2).get(1));


    }

}