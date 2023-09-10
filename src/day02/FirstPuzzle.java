package day02;

import java.io.IOException;
import java.util.ArrayList;
public class FirstPuzzle {
    public static void main(String[] args) throws IOException {
        System.out.println("Puzzle -  Day2, Part1");

        ArrayList<ArrayList<Character>> parsedPuzzleInput = new ArrayList<>();

        // Read puzzle input located in folder: /scr/main/resources
        PuzzleInput puzzleInput = new PuzzleInput();
        parsedPuzzleInput = puzzleInput.readIntoListOfCharacters("input_day02.txt");

        StrategyGuide strategyGuide = new StrategyGuide(parsedPuzzleInput);

        int scoreIfFollowedStrategyGuide = strategyGuide.calculateScore();

        System.out.println("Your score if you followed the strategy guide exactly: " + scoreIfFollowedStrategyGuide);

    }
}
