package hexlet.code;
import java.util.Scanner;

public class App {
    private static final int greet = 1;
    private static final int even = 2;
    private static final int calc = 3;
    private static final int gcd = 4;
    private static final int progression = 5;
    private static final int prime = 6;

    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
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
