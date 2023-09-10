package day02;

import java.util.ArrayList;
import java.util.HashMap;
public class StrategyGuideSecondPuzzle {
    ArrayList<ArrayList<Character>> listOfRockPaperScissorMoves;

    StrategyGuideSecondPuzzle(ArrayList<ArrayList<Character>> puzzleInput) {
        this.listOfRockPaperScissorMoves = puzzleInput;
    }


    public int calculateScore() {

        // Encrypted Moves
        HashMap<Character, String> encryptedMove = new HashMap<>();
        //Know Values
        encryptedMove.put('A', "rock");
        encryptedMove.put('B', "paper");
        encryptedMove.put('C', "scissors");
        // Assumed Values
        encryptedMove.put('X', "lose");
        encryptedMove.put('Y', "draw");
        encryptedMove.put('Z', "win");


        ArrayList<Integer> listOfScores = new ArrayList<>();

        for (ArrayList<Character> individualGame : listOfRockPaperScissorMoves) {
            int roundScore = calculateRoundScore(encryptedMove.get(individualGame.get(0)), encryptedMove.get(individualGame.get(1)));
            listOfScores.add(roundScore);
        }


        int sumOfScores = 0;


        for (int score : listOfScores) {
            sumOfScores += score;
        }


        return sumOfScores;
    }

    private int calculateRoundScore(String opponentsMove, String yourObjective) {

        // Score component for move you selected
        HashMap<String, Integer> yourMoveValue = new HashMap<>();
        yourMoveValue.put("rock", 1);
        yourMoveValue.put("paper", 2);
        yourMoveValue.put("scissors", 3);

        HashMap<String, Integer> rockPaperScissorsScore = new HashMap<>();
        rockPaperScissorsScore.put("win", 6);
        rockPaperScissorsScore.put("draw", 3);
        rockPaperScissorsScore.put("lose", 0);

        // Return composite score
        return rockPaperScissorsScore.get(yourObjective) + yourMoveValue.get(determineYourMove(opponentsMove, yourObjective));
    }

    private String determineYourMove(String opponentsMove, String yourObjective) {
        // Search for your move in response to your objective (win, lose, draw) and your opponents move
        ArrayList<String> listOfYourPossibleMoves = new ArrayList<>();
        listOfYourPossibleMoves.add("rock");
        listOfYourPossibleMoves.add("paper");
        listOfYourPossibleMoves.add("scissors");

        String yourMoveBasedOnObjective ="rock";

        for (String possibleMove : listOfYourPossibleMoves) {
            if (rockPaperScissorsRoundOutput(opponentsMove, possibleMove).equals(yourObjective))
                yourMoveBasedOnObjective = possibleMove;
        }
        return yourMoveBasedOnObjective;
    }

    private String rockPaperScissorsRoundOutput(String opponentsMove, String yourMove) {
        // Encode rules of Rock Paper Scissors game
        HashMap<String, HashMap<String, String>> rockPaperScissorsOutcome = new HashMap<>();

        //outcome if you choose rock
        HashMap<String, String> rockPaperScissorsYourMoveRock = new HashMap<>();
        rockPaperScissorsYourMoveRock.put("rock", "draw");
        rockPaperScissorsYourMoveRock.put("paper", "lose");
        rockPaperScissorsYourMoveRock.put("scissors", "win");
        rockPaperScissorsOutcome.put("rock", rockPaperScissorsYourMoveRock);

        //outcome if you choose paper
        HashMap<String, String> rockPaperScissorsYourMovePaper = new HashMap<>();
        rockPaperScissorsYourMovePaper.put("rock", "win");
        rockPaperScissorsYourMovePaper.put("paper", "draw");
        rockPaperScissorsYourMovePaper.put("scissors", "lose");
        rockPaperScissorsOutcome.put("paper", rockPaperScissorsYourMovePaper);

        //outcome if you choose scissors
        HashMap<String, String> rockPaperScissorsYourMoveScissors = new HashMap<>();
        rockPaperScissorsYourMoveScissors.put("rock", "lose");
        rockPaperScissorsYourMoveScissors.put("paper", "win");
        rockPaperScissorsYourMoveScissors.put("scissors", "draw");
        rockPaperScissorsOutcome.put("scissors", rockPaperScissorsYourMoveScissors);

        return rockPaperScissorsOutcome.get(yourMove).get(opponentsMove);
    }

}
