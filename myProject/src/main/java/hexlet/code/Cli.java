package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void cli(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
