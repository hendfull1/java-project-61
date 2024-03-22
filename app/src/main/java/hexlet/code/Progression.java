package hexlet.code;

public class Progression {
    public static void gameProgression() {
        var name = Cli.getName();
        System.out.println("What number is missing in the progression?");
        for (var i = 0; i < Engine.getGameLength(); i++) {
            int[] progression = new int[Engine.randomNumber(Engine.getMinProgressLength(),
                    Engine.getMaxProgressLength())];
            int firstNumber = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            int progressionNumber = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            progression[0] = firstNumber;
            for (var j = 1; j < progression.length; j++) {
                progression[j] = progression[j - 1] + progressionNumber;
            }
            int numberMissed = Engine.randomNumber(0, progression.length - 1);
            int correctNumber = progression[numberMissed];
            String[] progressionString = new String[progression.length];
            for (int l = 0; l < progressionString.length; l++) {
                progressionString[l] = String.valueOf(progression[l]);
            }
            progressionString[numberMissed] = "..";
            String progressionOutput = String.join(", ", progressionString);
            progressionOutput = progressionOutput.replace(",", "");
            System.out.println("Question: " + progressionOutput);
            System.out.print("Your answer: ");
            int answer = Engine.getUserInputInt();
            if (answer == correctNumber) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong anwser ;(. Correct answer was " + correctNumber);
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

}
