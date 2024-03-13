package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        System.out.println("Please enter the game and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        int numberGame = game.nextInt();
        System.out.println("Your choice: " + numberGame);
        if (numberGame == 2) {
            System.out.println("Welcome to the Brain Games");
            Cli.cli(args);
            Engine.gameIsEven(args);
        }
        if (numberGame == 3) {
            System.out.println("Welcome to the Brain Games");
            Cli.cli(args);
            Engine.gameCalc(args);
        }
        if (numberGame == 4) {
            System.out.println("Welcome to the Brain Games");
            Cli.cli(args);
            Engine.gameGCD(args);
        }
    }
}
