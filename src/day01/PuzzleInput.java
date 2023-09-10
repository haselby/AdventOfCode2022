package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PuzzleInput {

    public static ArrayList<Integer> readIntoListOfIntegers(String filename) throws IOException {

        ArrayList<Integer> listOfIntegers = new ArrayList<>();

        // Find input file in resources folder: /resources
        InputStream inputStream = PuzzleInput.class.getResourceAsStream("/" + filename);
        if (inputStream == null) throw new IOException("Input filename does not exist!");

        try (BufferedReader puzzleInputFile = new BufferedReader(new InputStreamReader(inputStream))) {
            String input;
            while ((input = puzzleInputFile.readLine()) != null) {
                String[] data = input.split(",");
                //Insert null into List of Integers where input file contains empty line
                Integer x = (data[0].isEmpty()) ? null : Integer.parseInt(data[0]);
                listOfIntegers.add(x);
            }

        } catch (IOException e) {
            throw new IOException();
        }

        return listOfIntegers;
    }
}
