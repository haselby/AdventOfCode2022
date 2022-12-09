package com.haselby.aoc2022.day2.part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class PuzzleInput {

    public static ArrayList<ArrayList<Character>> readIntoListOfCharacters(String filename) throws IOException {

        ArrayList<ArrayList<Character>> listOfCharacters = new ArrayList<>();

        // Find input file in resources folder: /scr/main/resources
        URL puzzleInputFileUrl = PuzzleInput.class.getClassLoader().getResource(filename);
        var file = (puzzleInputFileUrl != null) ? puzzleInputFileUrl.getFile() : null;
        if (file == null) throw new IOException("Input filename does not exist!");

        try (BufferedReader puzzleInputFile = new BufferedReader(new FileReader(file))) {
            int index = 0;
            String input;
            while ((input = puzzleInputFile.readLine()) != null) {
                String[] data = input.split(" ");
                //Insert null into List of Integers where input file contains empty line
                Character x = (data[0].isEmpty()) ? null : data[0].charAt(0);
                Character y = (data[1].isEmpty()) ? null : data[1].charAt(0);
                //Allocates space in 2D ArrayList of Characters [[A,B], [J,H] ....]
                listOfCharacters.add(new ArrayList<>());
                listOfCharacters.get(index).add(0, x);
                listOfCharacters.get(index).add(1, y);
                index++;
            }

        } catch (IOException e) {
            throw new IOException();
        }

        return listOfCharacters;
    }
}
