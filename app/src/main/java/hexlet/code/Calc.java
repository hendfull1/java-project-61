package hexlet.code;

public class Calc {
    public static void gameCalc() {
        var name = Cli.getName();
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < Engine.getGameLength(); i++) {
            int firstNumber = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            int secondNumber = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            int trueAnswer = 0;
            int operation = Engine.randomNumber(Engine.getMinGenerate(), Engine.getOperationsCount());
            String operationSymbol = switch (operation) {
                case Engine.ADDITION -> {
                    trueAnswer = firstNumber + secondNumber;
                    yield " + ";
                }
                case Engine.SUBTRACTION -> {
                    trueAnswer = firstNumber - secondNumber;
                    yield " - ";
                }
                case Engine.MULTIPLICATION -> {
                    trueAnswer = firstNumber * secondNumber;
                    yield " * ";
                }
                default -> "";
            };
            System.out.println("Question: " + firstNumber + operationSymbol + secondNumber);
            System.out.print("Your answer: ");
            int answer = Engine.getUserInputInt();
            if (answer == trueAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + trueAnswer);
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
