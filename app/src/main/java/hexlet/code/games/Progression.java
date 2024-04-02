package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_PROGRESS_LENGTH = 6;
    private static final int MAX_PROGRESS_LENGTH = 15;
    private static final int MIN_GENERATE = 1;
    private static final int MAX_GENERATE = 100;
    private static final int GAME_LENGTH = 3;
    private static final String QUESTION = "What number is missing in the progression?";

    public static String[] getProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }

    public static void gameProgression() {
        String[][] questionsAnswers = new String[GAME_LENGTH][2];
        for (var questionAnswer : questionsAnswers) {
            int firstNumber = Utils.randomNumber(MIN_GENERATE, MAX_GENERATE);
            int step = Utils.randomNumber(MIN_GENERATE, MAX_GENERATE);
            int length = Utils.randomNumber(MIN_PROGRESS_LENGTH, MAX_PROGRESS_LENGTH);
            String[] progression = getProgression(firstNumber, step, length);
            int numberMissed = Utils.randomNumber(0, progression.length - 1);
            String correctNumber = progression[numberMissed];
            progression[numberMissed] = "..";
            String progressionOutput = String.join(" ", progression);
            questionAnswer[0] = progressionOutput;
            questionAnswer[1] = correctNumber;
        }
        Engine.game(questionsAnswers, QUESTION);
    }
}

