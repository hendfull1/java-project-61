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
    public static void gameGcd() {
        var name = Cli.getName();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < Engine.getGameLength(); i++) {
            int firstNumber = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            int secondNumber = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            int trueAnswer = Gcd.gcd(firstNumber, secondNumber);
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            System.out.print("Your answer: ");
            int answer = Engine.getUserInputInt();
            if (answer == trueAnswer) {
                System.out.println("Correct");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + trueAnswer);
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
