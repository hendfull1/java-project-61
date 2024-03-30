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

    public static int[] getProgression() {
        int[] progression = new int[Utils.randomNumber(MIN_PROGRESS_LENGTH,
                MAX_PROGRESS_LENGTH)];
        int firstNumber = Utils.randomNumber(MIN_GENERATE, MAX_GENERATE);
        int progressionNumber = Utils.randomNumber(MIN_GENERATE, MAX_GENERATE);
        progression[0] = firstNumber;

        for (var i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + progressionNumber;
        }
        return progression;
    }

    public static void gameProgression() {
        String[][] numbers = new String[GAME_LENGTH][2];
        for (var number : numbers) {
            int[] progression = getProgression();
            int numberMissed = Utils.randomNumber(0, progression.length - 1);
            int correctNumber = progression[numberMissed];
            String[] progressionString = new String[progression.length];

            for (int i = 0; i < progressionString.length; i++) {
                progressionString[i] = String.valueOf(progression[i]);
            }

            progressionString[numberMissed] = "..";
            String progressionOutput = String.join(", ", progressionString);
            progressionOutput = progressionOutput.replace(",", "");
            number[0] = progressionOutput;
            number[1] = Integer.toString(correctNumber);
        }
        Engine.game(numbers, QUESTION);
    }
}

