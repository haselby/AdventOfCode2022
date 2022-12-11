package com.haselby.aoc2022.day3.part1;

import java.io.*;
import java.util.ArrayList;

public class PuzzleInput {

    public ArrayList<String> readIntoListOfStrings(String filename) throws IOException {

        ArrayList<String> listOfStrings = new ArrayList<>();

        // Read file located in resources folder: /scr/main/resources
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(filename);
        if (inputStream == null) throw new IOException("Input filename does not exist!");

        try (BufferedReader puzzleInputFile = new BufferedReader(new InputStreamReader(inputStream))) {
            String input;
            while ((input = puzzleInputFile.readLine()) != null) {
                listOfStrings.add(input);
            }

        } catch (IOException e) {
            throw new IOException();
        }

        return listOfStrings;
    }
}
