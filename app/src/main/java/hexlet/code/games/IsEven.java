package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class IsEven {
    public static String getQuestion() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static void gameIsEven() {
        Object[][] numbers = new Object[Engine.getGameLength()][2];
        for (var i = 0; i < Engine.getGameLength(); i++) {
            numbers[i][0] = Utils.randomNumber(Utils.getMinGenerate(), Utils.getMaxGenerate());
            if ((Integer) numbers[i][0] % 2 == 0) {
                numbers[i][1] = "yes";
            } else {
                numbers[i][1] = "no";
            }
        }
        Engine.game(numbers, getQuestion());
    }
}
