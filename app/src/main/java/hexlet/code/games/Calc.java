package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    //идентификатор сложения
    public static final int ADDITION = 1;
    //идентификатор вычитания
    public static final int SUBTRACTION = 2;
    //идентификатор умножения
    public static final int MULTIPLICATION = 3;
    private static final int OPERATIONS_COUNT = 4;
    public static String getOperation() {
        int operation = Engine.randomNumber(Engine.getMinGenerate(), OPERATIONS_COUNT);
        return switch (operation) {
            case ADDITION -> " + ";
            case SUBTRACTION -> " - ";
            case MULTIPLICATION -> " * ";
            default -> "";
        };
    }
    public static int calcResult(int firstNumber, int secondNumber, String operation) {
        return switch (operation.trim()) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> 0;
        };
    }

    public static String getQuestion() {
        return "What is the result of the expression?";
    }

    public static void gameCalc() {
        Object[][] numbers = new Object[Engine.getGameLength()][2];
        for (int i = 0; i < Engine.getGameLength(); i++) {
            int firstNumber = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            int secondNumber = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            String operation = getOperation();
            numbers[i][0] = firstNumber + operation + secondNumber;
            numbers[i][1] = calcResult(firstNumber, secondNumber, operation);
        }
        Engine.game(numbers, getQuestion());
    }
}

