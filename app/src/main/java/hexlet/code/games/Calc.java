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
        for (var number : numbers) {
            int operationIndex = Utils.randomNumber(0, operators.length);
            var operator = operators[operationIndex];
            int firstNumber = Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            int secondNumber = Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            number[0] = firstNumber + " " + operator + " " + secondNumber;
            number[1] = Integer.toString(calcResult(firstNumber, secondNumber, operators[operationIndex]));
        }
        Engine.game(numbers, getQuestion());
    }
}

