package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MIN_GENERATE = 1;
    private static final int MAX_GENERATE = 100;
    private static final String QUESTION = "What is the result of the expression?";
    private static final int GAME_LENGTH = 3;
    public static int calcResult(int firstNumber, int secondNumber, char operation) {
        return switch (operation) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> throw new RuntimeException("Unknown input: " + operation);
        };
    }

    public static void gameCalc() {
        String[][] questionsAnswers = new String[GAME_LENGTH][2];
        final char[] operators = {'+', '-', '*'};
        for (var questionAnswer : questionsAnswers) {
            int operationIndex = Utils.randomNumber(0, operators.length);
            var operator = operators[operationIndex];
            int firstNumber = Utils.randomNumber(MIN_GENERATE, MAX_GENERATE);
            int secondNumber = Utils.randomNumber(MIN_GENERATE, MAX_GENERATE);
            questionAnswer[0] = firstNumber + " " + operator + " " + secondNumber;
            questionAnswer[1] = Integer.toString(calcResult(firstNumber, secondNumber, operators[operationIndex]));
        }
        Engine.game(questionsAnswers, QUESTION);
    }
}

