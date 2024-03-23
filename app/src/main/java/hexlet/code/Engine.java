package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class Engine {

    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int randomNumber(int min, int max) {
        return RANDOM.nextInt(max - min) + min;
    }

    public static String getUserInput() {
        return SCANNER.nextLine();
    }


    public static void game(Object[][] numbers, String question) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = getUserInput();
        System.out.println("Hello, " + userName + "!");
        System.out.println(question);
        for (var i = 0; i < GAME_LENGTH; i++) {
            System.out.println(numbers[i][0]);
            Object answer;
            if (numbers[i][1].getClass().equals(String.class)) {
                System.out.print("Your answer: ");
                answer = getUserInput();
            } else {
                System.out.print("Your answer: ");
                answer = Integer.parseInt(getUserInput());
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
    }

    private static final int GAME_LENGTH = 3;
    public static int getGameLength() {
        return GAME_LENGTH;
    }
    private static final int MIN_GENERATE = 1;
    public static int getMinGenerate() {
        return MIN_GENERATE;
    }
    private static final int MAX_GENERATE = 100;
    public static int getMaxGenerate() {
        return MAX_GENERATE;
    }
    //идентификатор сложения
}
