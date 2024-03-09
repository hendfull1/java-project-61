package hexlet.code;
import java.util.Scanner;

public class Cli {

    private static String userName;

    public static void cli(String[] args) {
        System.out.println("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static String getName() {
        return userName;
    }

}
