package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class Engine {

    public static void game(Object[][] numbers, String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(question);
        for (var i = 0; i < GAME_LENGTH; i++) {
            System.out.print("Question: ");
            System.out.println(numbers[i][0]);
            Object answer;
            if (numbers[i][1].getClass().equals(String.class)) {
                System.out.print("Your answer: ");
                answer = scanner.next();
            } else {
                System.out.print("Your answer: ");
                answer = Integer.parseInt(scanner.next());
            }
            if (answer.equals(numbers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + numbers[i][1]);
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }

    private static final int GAME_LENGTH = 3;
    public static int getGameLength() {
        return GAME_LENGTH;
    }
}
