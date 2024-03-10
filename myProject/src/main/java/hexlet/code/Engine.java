package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class Engine {

    //Общая логика
    //Рандом генератор
    public static int randomNumber(int min, int max) {
        Random number = new Random();
        return number.nextInt(min , max);
    }

    //Ввод ответа
    public static String answerIsEven() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }

    //Логика игры IsEven
    public static void isCorrect(String answers , int number) {
        var name = Cli.getName();
        var wrongYes =  "'yes' is wrong answer ;(. Correct answer was 'no'";
        var wrongNo = "'no' is wrong answer ;(. Correct answer was 'yes'";
        if (answers.equals("yes") && number % 2 == 0) {
            System.out.println("Correct!");
        }
        else if (answers.equals("no") && number % 2 != 0) {
            System.out.println("Correct!");
        }
        else if (answers.equals("yes")){
            System.out.println(wrongYes);
            System.out.println("let's tru again, " + name);
            System.exit(0);
        }
        else if (answers.equals("no")){
            System.out.println(wrongNo);
            System.out.println("let's tru again, " + name);
            System.exit(0);
        }
        else {
            System.out.println("Incorrect!");
            System.out.println("let's tru again, " + name);
            System.exit(0);
        }
    }

    public static void gameIsEven(String[] args) {
        var name = Cli.getName();
        int numberOne = randomNumber(1 , 100);
        int numberTwo = randomNumber(1 , 100);
        int numberThree = randomNumber(1, 100);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: " + numberOne);
        var answerOne = answerIsEven();
        isCorrect(answerOne , numberOne);
        System.out.println("Question: " + numberTwo);
        var answerTwo = answerIsEven();
        isCorrect(answerTwo , numberTwo);
        System.out.println("Question: " + numberThree);
        var answerThree = answerIsEven();
        isCorrect(answerThree , numberThree);
        System.out.println("Congratulations, " + name + "!");
    }

    // Калькулятор
    public static int answerCalc() {
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        return answer;
    }
    private static String operation = "";
    private static int trueAnswer = 0;
    public static void calc(String[] args) {
        // 1 - +; 2 - -; 3 - *;
        var numberOfOperation = randomNumber(1 , 4);
        var firstNumber = randomNumber(1 , 100);
        var secondNumber = randomNumber(1 , 100);
        if (numberOfOperation == 1) {
            trueAnswer = firstNumber + secondNumber;
            operation = firstNumber + " + " + secondNumber;
        }
        if (numberOfOperation == 2) {
            trueAnswer = firstNumber - secondNumber;
            operation = firstNumber + " - " + secondNumber;
        }
        if (numberOfOperation == 3) {
            trueAnswer = firstNumber * secondNumber;
            operation = firstNumber + " * " + secondNumber;
        }
    }

    public static void gameCalc(String[] args) {
        var name = Cli.getName();
        System.out.println("What is the result of the expression?");

        //первый вопрос
        calc(args);
        System.out.println("Question: " + operation);
        var answerOne = answerCalc();
        if (answerOne == trueAnswer) {
            System.out.println("Correct!");
        }
        else {
            System.out.println(answerOne + " is wrong answer ;(. Correct answer was " + trueAnswer);
            System.out.println("let's try again, " + name);
            System.exit(0);
        }

        // второй вопрос
        calc(args);
        System.out.println("Question: " + operation);
        var answerTwo = answerCalc();
        if (answerTwo == trueAnswer) {
            System.out.println("Correct!");
        }
        else {
            System.out.println(answerTwo + " is wrong answer ;(. Correct answer was " + trueAnswer);
            System.out.println("let's try again, " + name);
            System.exit(0);
        }

        //Третий вопрос
        calc(args);
        System.out.println("Question: " + operation);
        var answerThree = answerCalc();
        if (answerThree == trueAnswer) {
            System.out.println("Congratulations, " + name + "!");
        }
        else {
            System.out.println(answerThree + " is wrong answer ;(. Correct answer was " + trueAnswer);
            System.out.println("let's try again, " + name);
            System.exit(0);
        }
    }
}
