package com.haselby.aoc2022.day1.part1;

public class Puzzle {
    public static void main(String[] args) {
        System.out.println("Hello Day1, Part1");

        //Read puzzle input located in folder: /scr/main/resources
        try {
            InputFileReader.print("input.txt");
            InputFileReader.readIntoListOfStrings("input.txt");
            InputFileReader.readIntoListOfIntegers("input.txt");
        }
        catch(Exception e) {
            System.out.println("Puzzle input is missing. Closing application");
            System.exit(0);
        }

        System.out.println("Puzzle input read successfully");

    }
}
