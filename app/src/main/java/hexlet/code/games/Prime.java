package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int MIN_GENERATE = 1;
    private static final int MAX_GENERATE = 100;
    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int GAME_LENGTH = 3;
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
        String[][] questionsAnswers = new String[GAME_LENGTH][2];
        for (var questionAnswer : questionsAnswers) {
            questionAnswer[0] = Integer.toString(Utils.randomNumber(MIN_GENERATE, MAX_GENERATE));
            questionAnswer[1] = isPrime(Integer.parseInt(questionAnswer[0])) == Boolean.TRUE ? "yes" : "no";
        }
        Engine.game(questionsAnswers, QUESTION);
    }
}
