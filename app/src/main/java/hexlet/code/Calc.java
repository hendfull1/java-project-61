package hexlet.code;
public class Calc {
    public static String getOperation() {
        int operation = Engine.randomNumber(Engine.getMinGenerate(), Engine.getOperationsCount());
        return switch (operation) {
            case Engine.ADDITION -> " + ";
            case Engine.SUBTRACTION -> " - ";
            case Engine.MULTIPLICATION -> " * ";
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

