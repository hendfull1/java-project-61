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
        Object[][] numbers = new Object[Engine.getGameLength()][2];
        final char[] operators = {'+', '-', '*'};
        for (int i = 0; i < Engine.getGameLength(); i++) {
            int operationIndex = Utils.randomNumber(Utils.getMinGenerate(), operators.length);
            var operator = operators[operationIndex];
            int firstNumber = Utils.randomNumber(Utils.getMinGenerate(), Utils.getMaxGenerate());
            int secondNumber = Utils.randomNumber(Utils.getMinGenerate(), Utils.getMaxGenerate());
            numbers[i][0] = firstNumber + " " + operator + " " + secondNumber;
            numbers[i][1] = calcResult(firstNumber, secondNumber, operators[operationIndex]);
        }
        Engine.game(numbers, getQuestion());
    }
}

