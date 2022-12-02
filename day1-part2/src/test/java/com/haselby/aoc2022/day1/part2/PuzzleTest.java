package com.haselby.aoc2022.day1.part2;
import org.junit.jupiter.api.*;

@DisplayName("Day 1, Part 2 - Puzzle Test")
public class PuzzleTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }

    @Test
    @DisplayName("First test")
    void firstTest() {
        System.out.println("First test method");
    }

    @Test
    @DisplayName("Second test")
    void secondTest() {
        System.out.println("Second test method");
    }
}
