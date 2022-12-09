package com.haselby.aoc2022.day2.part1;

import java.util.ArrayList;
import java.util.HashMap;

public class StrategyGuide {
    ArrayList<ArrayList<Character>> listOfRockPaperScissorMoves = new ArrayList<>();

    StrategyGuide(ArrayList<ArrayList<Character>> puzzleInput) {
        this.listOfRockPaperScissorMoves = puzzleInput;
    }

    public int calculateScore() {

        // Score component for move you selected
        HashMap<String, Integer> moveValue = new HashMap<>();
        moveValue.put("rock", 1);
        moveValue.put("paper", 2);
        moveValue.put("scissors", 3);

        // Encrypted Moves
        HashMap<Character, String> encryptedMove = new HashMap<>();
        //Know Values
        encryptedMove.put('A', "rock");
        encryptedMove.put('B', "paper");
        encryptedMove.put('C', "scissors");
        // Assumed Values
        encryptedMove.put('X', "rock");
        encryptedMove.put('Y', "paper");
        encryptedMove.put('Z', "scissors");

        ArrayList<Integer> listOfScores = new ArrayList<>();

        for (ArrayList<Character> individualGame : listOfRockPaperScissorMoves) {
            // TODO: Haselby - Correctly calculate individual game score
            int gameScore = 1;
            listOfScores.add(gameScore);
        }

        int sumOfScores = 0;

        for (int score : listOfScores) {
            sumOfScores += score;
        }


        return sumOfScores;
    }

}
