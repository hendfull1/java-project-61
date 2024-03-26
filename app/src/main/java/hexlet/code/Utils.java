package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int MIN_GENERATE = 1;
    public static final int MAX_GENERATE = 100;
    private static final Random RANDOM = new Random();

    public static int randomNumber(int min, int max) {
        return RANDOM.nextInt(max - min) + min;
    }
}
