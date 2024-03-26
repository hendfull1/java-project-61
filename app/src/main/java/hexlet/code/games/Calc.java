package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static int calcResult(int firstNumber, int secondNumber, char operation) {
        return switch (operation) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> 0;
        };
    }

    public static String getQuestion() {
        return "What is the result of the expression?";
    }

    public static void gameCalc() {
        String[][] numbers = new String[Engine.GAME_LENGTH][2];
        final char[] operators = {'+', '-', '*'};
        for (int i = 0; i < Engine.GAME_LENGTH; i++) {
            int operationIndex = Utils.randomNumber(Utils.MIN_GENERATE, operators.length);
            var operator = operators[operationIndex];
            int firstNumber = Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            int secondNumber = Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            numbers[i][0] = firstNumber + " " + operator + " " + secondNumber;
            numbers[i][1] = Integer.toString(calcResult(firstNumber, secondNumber, operators[operationIndex]));
        }
        Engine.game(numbers, getQuestion());
    }
}

