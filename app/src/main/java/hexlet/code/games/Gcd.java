package hexlet.code.games;

import hexlet.code.Engine;

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
        Object[][] gcdArrays = new Object[Engine.getGameLength()][2];
        for (var i = 0; i < Engine.getGameLength(); i++) {
            int firstNumber = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            int secondNumber = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            gcdArrays[i][0] = firstNumber + " " + secondNumber;
            gcdArrays[i][1] = gcd(firstNumber, secondNumber);
        }
        Engine.game(gcdArrays, getQuestion());
    }
}
