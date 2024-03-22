package hexlet.code;
import java.util.Random;
import java.util.Scanner;
public class Engine {

    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int randomNumber(int min, int max) {
        return RANDOM.nextInt(max - min) + min;
    }

    public static String getUserInput() {
        return SCANNER.nextLine();
    }

    public static int getUserInputInt() {
        return SCANNER.nextInt();
    }

    private static final int GAME_LENGTH = 3;
    public static int getGameLength() {
        return GAME_LENGTH;
    }
    private static final int MIN_GENERATE = 1;
    public static int getMinGenerate() {
        return MIN_GENERATE;
    }
    private static final int MAX_GENERATE = 100;
    public static int getMaxGenerate() {
        return MAX_GENERATE;
    }
    private static final int OPERATIONS_COUNT = 4;
    public static int getOperationsCount() {
        return OPERATIONS_COUNT;
    }
    private static final int MIN_PROGRESS_LENGTH = 6;
    public static int getMinProgressLength() {
        return MIN_PROGRESS_LENGTH;
    }
    private static final int MAX_PROGRESS_LENGTH = 15;
    public static int getMaxProgressLength() {
        return MAX_PROGRESS_LENGTH;
    }
    //идентификатор сложения
    public static final int ADDITION = 1;
    //идентификатор вычитания
    public static final int SUBTRACTION = 2;
    //идентификатор умножения
    public static final int MULTIPLICATION = 3;

}
