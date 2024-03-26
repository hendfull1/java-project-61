package hexlet.code;
import java.util.Scanner;
public class Engine {

    public static void game(String[][] numbers, String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(question);
        for (var number : numbers) {
            System.out.print("Question: ");
            System.out.println(number[0]);
            String answer;
            System.out.print("Your answer: ");
            answer = scanner.next();
            if (answer.equals(number[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + number[1]);
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }

    public static final int GAME_LENGTH = 3;

}
