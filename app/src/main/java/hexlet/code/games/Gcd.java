package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static int gcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }

    public static String getQuestion() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void gameGcd() {
        String[][] gcdArrays = new String[Engine.GAME_LENGTH][2];
        for (var i = 0; i < Engine.GAME_LENGTH; i++) {
            int firstNumber = Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            int secondNumber = Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE);
            gcdArrays[i][0] = firstNumber + " " + secondNumber;
            gcdArrays[i][1] = Integer.toString(gcd(firstNumber, secondNumber));
        }
        Engine.game(gcdArrays, getQuestion());
    }
}
