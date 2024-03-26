package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int MIN_GENERATE = 1;
    public static int getMinGenerate() {
        return MIN_GENERATE;
    }
    private static final int MAX_GENERATE = 100;
    public static int getMaxGenerate() {
        return MAX_GENERATE;
    }

    private static final Random RANDOM = new Random();

    public static int randomNumber(int min, int max) {
        return RANDOM.nextInt(max - min) + min;
    }
}
