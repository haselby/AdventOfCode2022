package day02;

import java.io.*;
import java.util.ArrayList;
public class PuzzleInput {


    public ArrayList<ArrayList<Character>> readIntoListOfCharacters(String filename) throws IOException {

        ArrayList<ArrayList<Character>> listOfCharacters = new ArrayList<>();

        // Read file located in resources folder: /scr/main/resources
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(filename);
        if (inputStream == null) throw new IOException("Input filename does not exist!");

        try (BufferedReader puzzleInputFile = new BufferedReader(new InputStreamReader(inputStream))) {
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
