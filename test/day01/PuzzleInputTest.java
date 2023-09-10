package day01;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// Unit Test Naming Standard:   UnitOfWork_StateUnderTest_ExpectedBehavior
// https://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html

@DisplayName("Day 1, Part 1 - PuzzleInput Test")
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
    @DisplayName("readIntoListOfIntegers - passing example input file - should not throw exception")
    void readIntoListOfIntegers_ExampleInputFile_ShouldNotThrowException() {
        assertDoesNotThrow(() -> PuzzleInput.readIntoListOfIntegers("input_day01-01.txt"));
    }

    @Test
    @DisplayName("readIntoListOfIntegers - passing missing input file - should throw exception")
    void readIntoListOfIntegers_MissingInputFile_ThrowsException() {
        assertThrows(IOException.class, () -> PuzzleInput.readIntoListOfIntegers("missing-file.txt"));

    }

    @Test
    @DisplayName("readIntoListOfIntegers - passing example input file - returns expected list of Integers")
    void readIntoListOfIntegers_ExampleInputFile_ReturnsExpectedListOfIntegers() {
        List<Integer> puzzleInputTest01 = new ArrayList<>();

        try {
            puzzleInputTest01 = PuzzleInput.readIntoListOfIntegers("input_day01-01.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(1000, puzzleInputTest01.get(0));
        assertEquals(2000, puzzleInputTest01.get(1));
        assertEquals(3000, puzzleInputTest01.get(2));
        assertNull(puzzleInputTest01.get(3));
        assertEquals(4000, puzzleInputTest01.get(4));
        assertNull(puzzleInputTest01.get(5));
        assertEquals(5000, puzzleInputTest01.get(6));
        assertEquals(6000, puzzleInputTest01.get(7));
        assertNull(puzzleInputTest01.get(8));
        assertEquals(7000, puzzleInputTest01.get(9));
        assertEquals(8000, puzzleInputTest01.get(10));
        assertEquals(9000, puzzleInputTest01.get(11));
        assertNull(puzzleInputTest01.get(12));
        assertEquals(10000, puzzleInputTest01.get(13));

    }

    @Test
    @DisplayName("readIntoListOfIntegers - passing example input file - should convert empty lines to null")
    void readIntoListOfIntegers_ExampleInputFile_ShouldConvertEmptyLinesToNull() {

        List<Integer> puzzleInputTest01 = new ArrayList<>();

        try {
            puzzleInputTest01 = PuzzleInput.readIntoListOfIntegers("input_day01-01.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        assertNull(puzzleInputTest01.get(3));
        assertNull(puzzleInputTest01.get(5));
        assertNull(puzzleInputTest01.get(8));
        assertNull(puzzleInputTest01.get(12));

    }
}
