package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final int MIN_GENERATE = 1;
    private static final int MAX_GENERATE = 100;
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";
    private static final int GAME_LENGTH = 3;
    public static int gcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }

    public static void gameGcd() {
        String[][] questionsAnswers = new String[GAME_LENGTH][2];
        for (var questionAnswer : questionsAnswers) {
            int firstNumber = Utils.randomNumber(MIN_GENERATE, MAX_GENERATE);
            int secondNumber = Utils.randomNumber(MIN_GENERATE, MAX_GENERATE);
            questionAnswer[0] = firstNumber + " " + secondNumber;
            questionAnswer[1] = Integer.toString(gcd(firstNumber, secondNumber));
        }
        Engine.game(questionsAnswers, QUESTION);
    }
}
