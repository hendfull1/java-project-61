package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MIN_GENERATE = 1;
    private static final int MAX_GENERATE = 100;
    public static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void gameIsEven() {
        String[][] numbers = new String[Engine.GAME_LENGTH][2];
        for (var number : numbers) {
            number[0] = Integer.toString(Utils.randomNumber(MIN_GENERATE, MAX_GENERATE));
            number[1] = Integer.parseInt(number[0]) % 2 == 0 ? "yes" : "no";
        }
        Engine.game(numbers, QUESTION);
    }
}
