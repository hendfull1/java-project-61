package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static String getQuestion() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public static Boolean isPrime(int number) {
        if (number <= 1) {
            return Boolean.FALSE;
        }
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
    public static void gamePrime() {
        String[][] numbers = new String[Engine.GAME_LENGTH][2];
        for (var number : numbers) {
            number[0] = Integer.toString(Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE));
            if (isPrime(Integer.parseInt(number[0])) == Boolean.TRUE) {
                number[1] = "yes";
            } else {
                number[1] = "no";
            }
        }
        Engine.game(numbers, getQuestion());
    }
}
