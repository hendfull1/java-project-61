package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_PROGRESS_LENGTH = 6;
    private static final int MAX_PROGRESS_LENGTH = 15;


    public static String getQuestion() {
        return "What number is missing in the progression?";
    }
    public static void gameProgression() {
        Object[][] numbers = new Object[Engine.getGameLength()][2];
        for (var i = 0; i < Engine.getGameLength(); i++) {

            int[] progression = new int[Utils.randomNumber(MIN_PROGRESS_LENGTH,
                    MAX_PROGRESS_LENGTH)];
            int firstNumber = Utils.randomNumber(Utils.getMinGenerate(), Utils.getMaxGenerate());
            int progressionNumber = Utils.randomNumber(Utils.getMinGenerate(), Utils.getMaxGenerate());
            progression[0] = firstNumber;

            for (var j = 1; j < progression.length; j++) {
                progression[j] = progression[j - 1] + progressionNumber;
            }

            int numberMissed = Utils.randomNumber(0, progression.length - 1);
            int correctNumber = progression[numberMissed];
            String[] progressionString = new String[progression.length];

            for (int l = 0; l < progressionString.length; l++) {
                progressionString[l] = String.valueOf(progression[l]);
            }

            progressionString[numberMissed] = "..";
            String progressionOutput = String.join(", ", progressionString);
            progressionOutput = progressionOutput.replace(",", "");
            numbers[i][0] = progressionOutput;
            numbers[i][1] = correctNumber;
        }
        Engine.game(numbers, getQuestion());
    }
}

