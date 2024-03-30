package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final int MIN_GENERATE = 1;
    private static final int MAX_GENERATE = 100;
    public static final String QUESTION = "Find the greatest common divisor of given numbers.";
    public static int gcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }

    public static void gameGcd() {
        String[][] numbers = new String[Engine.GAME_LENGTH][2];
        for (var number : numbers) {
            int firstNumber = Utils.randomNumber(MIN_GENERATE, MAX_GENERATE);
            int secondNumber = Utils.randomNumber(MIN_GENERATE, MAX_GENERATE);
            number[0] = firstNumber + " " + secondNumber;
            number[1] = Integer.toString(gcd(firstNumber, secondNumber));
        }
        Engine.game(numbers, QUESTION);
    }
}
