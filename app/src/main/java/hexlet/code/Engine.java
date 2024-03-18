package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class Engine {

    //Общая логика
    //Рандом генератор
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int randomNumber(int min, int max) {
        return RANDOM.nextInt(max - min) + min;
    }

    public static String getUserInput() {
        return SCANNER.nextLine();
    }

    public static int getUserInputInt() {
        return SCANNER.nextInt();
    }

    //Логика игры IsEven
    public static void isCorrect(String answer, int number) {
        String name = Cli.getName();
        if ((answer.equals("yes") && ((number % 2) == 0)) || (answer.equals("no") && ((number % 2) != 0))) {
            System.out.println("Correct!");
        } else {
            System.out.println(answer.equals("yes") ? "'yes' is wrong answer ;(. Correct answer was 'no'"
                    : "'no' is wrong answer ;(. Correct answer was 'yes'");
            System.out.println("Let's try again, " + name + "!");
            System.exit(0);
        }
    }

    public static void gameIsEven(String[] args) {
        String name = Cli.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int number = randomNumber(1, 100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = getUserInput();
            isCorrect(answer, number);
        }
        System.out.println("Congratulations, " + name + "!");
    }

    // Калькулятор

    public static void gameCalc(String[] args) {
        var name = Cli.getName();
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < 3; i++) {
            int firstNumber = randomNumber(1, 100);
            int secondNumber = randomNumber(1, 100);
            int operation = randomNumber(1, 4);
            int trueAnswer = 0;
            String operationSymbol = switch (operation) {
                case 1 -> {
                    trueAnswer = firstNumber + secondNumber;
                    yield " + ";
                }
                case 2 -> {
                    trueAnswer = firstNumber - secondNumber;
                    yield " - ";
                }
                case 3 -> {
                    trueAnswer = firstNumber * secondNumber;
                    yield " * ";
                }
                default -> "";
            };
            System.out.println("Question: " + firstNumber + operationSymbol + secondNumber);
            System.out.print("Your answer: ");
            int answer = getUserInputInt();
            if (answer == trueAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + trueAnswer);
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    // НОД
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
    public static void gameGcd(String[] args) {
        var name = Cli.getName();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < 3; i++) {
            int firstNumber = randomNumber(1, 51);
            int secondNumber = randomNumber(1, 51);
            int trueAnswer = Engine.gcd(firstNumber, secondNumber);
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            System.out.print("Your answer: ");
            int answer = getUserInputInt();
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

    // Прогрессия
    public static void gameProgression(String[] args) {
        var name = Cli.getName();
        System.out.println("What number is missing in the progression?");
        for (var i = 0; i < 3; i++) {
            int[] progression = new int[randomNumber(6, 15)];
            int firstNumber = randomNumber(1, 10);
            int progressionNumber = randomNumber(1, 10);
            progression[0] = firstNumber;
            for (var j = 1; j < progression.length; j++) {
                progression[j] = progression[j - 1] + progressionNumber;
            }
            int numberMissed = randomNumber(4, progression.length - 1);
            int correctNumber = progression[numberMissed];
            String[] progressionString = new String[progression.length];
            for (int l = 0; l < progressionString.length; l++) {
                progressionString[l] = String.valueOf(progression[l]);
            }
            progressionString[numberMissed] = "..";
            String progressionOutput = String.join(", ", progressionString);
            progressionOutput = progressionOutput.replace(",", "");
            System.out.println("Question: " + progressionOutput);
            System.out.print("Your answer: ");
            int answer = getUserInputInt();
            if (answer == correctNumber) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong anwser ;(. Correct answer was " + correctNumber);
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static boolean isPrime(int number) {
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void gamePrime(String[] args) {
        var name = Cli.getName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            int number = randomNumber(1, 100);
            System.out.println("Question: " + number);
            var answer = getUserInput();
            var trueAnswer = Engine.isPrime(number);
            System.out.println("Your answer: " + answer);
            if ((answer.equals("yes") && trueAnswer) || (answer.equals("no") && !trueAnswer)) {
                System.out.println("Correct!");
            } else if (answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(, correct answer was 'no'");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            } else {
                System.out.println("'no' is wrong answer ;(, correct answer was 'yes'");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
