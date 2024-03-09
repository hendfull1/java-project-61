package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class GameIsEven {
    public static int randomNumber(int min, int max) {
        Random number = new Random();
        return number.nextInt(min , max);
    }

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

    public static String answer() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }
    public static void game(String[] args) {
        var name = Cli.getName();
        int numberOne = randomNumber(1 , 100);
        int numberTwo = randomNumber(1 , 100);
        int numberThree = randomNumber(1, 100);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: " + numberOne);
        var answerOne = answer();
        isCorrect(answerOne , numberOne);
        System.out.println("Question: " + numberTwo);
        var answerTwo = answer();
        isCorrect(answerTwo , numberTwo);
        System.out.println("Question: " + numberThree);
        var answerThree = answer();
        isCorrect(answerThree , numberThree);
        System.out.println("Congratulations, " + name + "!");
    }
}
