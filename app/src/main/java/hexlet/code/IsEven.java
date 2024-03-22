package hexlet.code;

public class IsEven {
    public static void isCorrect(String answer, int number) {
        String name = Cli.getName();
        if ((answer.equals("yes") && ((number % 2) == 0)) || (answer.equals("no") && ((number % 2) != 0))) {
            System.out.println("Correct!");
        } else {
            System.out.println(answer.equals("yes") ? "'yes' is wrong answer ;(. Correct answer was 'no'"
                    : "'no' is wrong answer ;(. Correct answer was 'yes'");
            System.out.println("Let's try again, " + name + "!");
            System.exit(0);
        }
    }

    public static void gameIsEven() {
        String name = Cli.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < Engine.getGameLength(); i++) {
            int number = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = Engine.getUserInput();
            isCorrect(answer, number);
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
