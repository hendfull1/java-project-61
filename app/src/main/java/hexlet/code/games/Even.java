package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static String getQuestion() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static void gameIsEven() {
        String[][] numbers = new String[Engine.GAME_LENGTH][2];
        for (var i = 0; i < Engine.GAME_LENGTH; i++) {
            numbers[i][0] = Integer.toString(Utils.randomNumber(Utils.MIN_GENERATE, Utils.MAX_GENERATE));
            if (Integer.parseInt(numbers[i][0]) % 2 == 0) {
                numbers[i][1] = "yes";
            } else {
                numbers[i][1] = "no";
            }
        }
        Engine.game(numbers, getQuestion());
    }
}
