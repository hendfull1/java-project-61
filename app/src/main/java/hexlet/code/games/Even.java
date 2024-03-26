package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static String getQuestion() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static void gameIsEven() {
        String[][] numbers = new String[Engine.GAME_LENGTH][2];
        for (var number : numbers) {
            number[0] = Integer.toString(Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE));
            if (Integer.parseInt(number[0]) % 2 == 0) {
                number[1] = "yes";
            } else {
                number[1] = "no";
            }
        }
        Engine.game(numbers, getQuestion());
    }
}
