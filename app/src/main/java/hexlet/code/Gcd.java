package hexlet.code;

public class Gcd {
    public static int gcd(int firstNumber, int secondNumber) {
        if (secondNumber == firstNumber) {
            return secondNumber;
        } else if (firstNumber <= secondNumber) {
            while (firstNumber != 0) {
                int temp = firstNumber;
                firstNumber = secondNumber % firstNumber;
                secondNumber = temp;
            }
            return secondNumber;
        } else {
            while (secondNumber != 0) {
                int temp = secondNumber;
                secondNumber = firstNumber % secondNumber;
                firstNumber = temp;
            }
            return firstNumber;
        }
    }

    public static String getQuestion() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void gameGcd() {
        Object[][] GcdArrays = new Object[Engine.getGameLength()][2];
        for (var i = 0; i < Engine.getGameLength(); i++) {
            int firstNumber = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            int secondNumber = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            GcdArrays[i][0] = firstNumber + " " + secondNumber;
            GcdArrays[i][1] = gcd(firstNumber, secondNumber);
            }
        Engine.game(GcdArrays, getQuestion());
    }
}
