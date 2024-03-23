package hexlet.code;

public class IsPrime {

    public static String getQuestion() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public static String isPrime(int number) {
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
    public static void gamePrime() {
        Object[][] numbers = new Object[Engine.getGameLength()][2];
        for (var i = 0; i < Engine.getGameLength(); i++) {
            numbers[i][0] = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            numbers[i][1] = IsPrime.isPrime((Integer)numbers[i][0]);
        }
        Engine.game(numbers, getQuestion());
    }
}
