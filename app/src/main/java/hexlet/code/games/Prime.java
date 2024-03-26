package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static String getQuestion() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public static String isPrime(int number) {
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
    public static void gamePrime() {
        String[][] numbers = new String[Engine.GAME_LENGTH][2];
        for (var number : numbers) {
            number[0] = Integer.toString(Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE));
            number[1] = isPrime(Integer.parseInt(number[0]));
        }
        Engine.game(numbers, getQuestion());
    }
}
