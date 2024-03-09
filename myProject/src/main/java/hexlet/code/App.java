package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        System.out.println("Please enter the game and press Enter.");
        System.out.println("2 - Even");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        int numberGame = game.nextInt();
        System.out.println("Your choice: " + numberGame);
        if (numberGame == 2) {
            System.out.println("Welcome to the Brain Games");
            Cli.cli(args);
            GameIsEven.game(args);
        }
    }
}
