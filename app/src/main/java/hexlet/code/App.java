package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        var greet = 1;
        var even = 2;
        var calc = 3;
        var gcd = 4;
        var progression = 5;
        var prime = 6;
        System.out.println("Please enter the game and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        int numberGame = game.nextInt();
        System.out.println("Your choice: " + numberGame);
        if (numberGame == greet) {
            System.out.println("Welcome to the Brain Games!");
            Cli.cli(args);
        }
        if (numberGame == even) {
            System.out.println("Welcome to the Brain Games!");
            Cli.cli(args);
            Engine.gameIsEven(args);
        }
        if (numberGame == calc) {
            System.out.println("Welcome to the Brain Games!");
            Cli.cli(args);
            Engine.gameCalc(args);
        }
        if (numberGame == gcd) {
            System.out.println("Welcome to the Brain Games!");
            Cli.cli(args);
            Engine.gameGcd(args);
        }
        if (numberGame == progression) {
            System.out.println("Welcome to the Brain Games!");
            Cli.cli(args);
            Engine.gameProgression(args);
        }
        if (numberGame == prime) {
            System.out.println("Welcome to the Brain Games!");
            Cli.cli(args);
            Engine.gamePrime(args);
        }
    }
}
