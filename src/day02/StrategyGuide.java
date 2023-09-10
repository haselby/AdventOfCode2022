package day02;

import java.util.ArrayList;
import java.util.HashMap;

    public class StrategyGuide {
        ArrayList<ArrayList<Character>> listOfRockPaperScissorMoves;

        StrategyGuide(ArrayList<ArrayList<Character>> puzzleInput) {
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
            encryptedMove.put('X', "rock");
            encryptedMove.put('Y', "paper");
            encryptedMove.put('Z', "scissors");

            ArrayList<Integer> listOfScores = new ArrayList<>();

            for (ArrayList<Character> individualGame : listOfRockPaperScissorMoves) {
                // TODO: Haselby - Correctly calculate individual game score
                int roundScore = calculateRoundScore(encryptedMove.get(individualGame.get(0)), encryptedMove.get(individualGame.get(1)));
                listOfScores.add(roundScore);
            }


            int sumOfScores = 0;

            for (int score : listOfScores) {
                sumOfScores += score;
            }


            return sumOfScores;
        }

        private int calculateRoundScore(String opponentsMove, String yourMove) {
            // Encode rules of Rock Paper Scissors game
            HashMap<String, HashMap<String, String>> rockPaperScissorsOutcome = new HashMap<>();

            //outcome if you choose rock
            HashMap<String, String> rockPaperScissorsYourMoveRock = new HashMap<>();
            rockPaperScissorsYourMoveRock.put("rock", "tie");
            rockPaperScissorsYourMoveRock.put("paper", "lose");
            rockPaperScissorsYourMoveRock.put("scissors", "win");
            rockPaperScissorsOutcome.put("rock", rockPaperScissorsYourMoveRock);

            //outcome if you choose paper
            HashMap<String, String> rockPaperScissorsYourMovePaper = new HashMap<>();
            rockPaperScissorsYourMovePaper.put("rock", "win");
            rockPaperScissorsYourMovePaper.put("paper", "tie");
            rockPaperScissorsYourMovePaper.put("scissors", "lose");
            rockPaperScissorsOutcome.put("paper", rockPaperScissorsYourMovePaper);

            //outcome if you choose scissors
            HashMap<String, String> rockPaperScissorsYourMoveScissors = new HashMap<>();
            rockPaperScissorsYourMoveScissors.put("rock", "lose");
            rockPaperScissorsYourMoveScissors.put("paper", "win");
            rockPaperScissorsYourMoveScissors.put("scissors", "tie");
            rockPaperScissorsOutcome.put("scissors", rockPaperScissorsYourMoveScissors);

            // Score component for move you selected
            HashMap<String, Integer> yourMoveValue = new HashMap<>();
            yourMoveValue.put("rock", 1);
            yourMoveValue.put("paper", 2);
            yourMoveValue.put("scissors", 3);

            HashMap<String, Integer> rockPaperScissorsScore = new HashMap<>();
            rockPaperScissorsScore.put("win", 6);
            rockPaperScissorsScore.put("tie", 3);
            rockPaperScissorsScore.put("lose", 0);


            String yourRoundOutcome = rockPaperScissorsOutcome.get(yourMove).get(opponentsMove);

            System.out.println("Your move: " + yourMove + "\t" + "Opponent's move: " + opponentsMove + "\t" + "-->" + "\t" + yourRoundOutcome);

            // Return composite score
            return rockPaperScissorsScore.get(yourRoundOutcome) + yourMoveValue.get(yourMove);
        }
}
