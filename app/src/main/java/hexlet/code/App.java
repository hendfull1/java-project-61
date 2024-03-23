package hexlet.code;
import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void choice() {
        System.out.println("Please enter the game and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }

    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        choice();
        int numberGame = game.nextInt();
        System.out.println("Your choice: " + numberGame);
        if (numberGame == GREET) {
            System.out.println("Welcome to the Brain Games!");
            // Оставил Cli только тут
            Cli.cli();
        }
        if (numberGame == EVEN) {
            IsEven.gameIsEven();
        }
        if (numberGame == CALC) {
            Calc.gameCalc();
        }
        if (numberGame == GCD) {
            Gcd.gameGcd();
        }
        if (numberGame == PROGRESSION) {
            Progression.gameProgression();
        }
        if (numberGame == PRIME) {
            IsPrime.gamePrime();
        }
    }
}
