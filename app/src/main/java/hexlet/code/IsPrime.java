package hexlet.code;

public class IsPrime {
    public static boolean isPrime(int number) {
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void gamePrime() {
        var name = Cli.getName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < Engine.getGameLength(); i++) {
            int number = Engine.randomNumber(Engine.getMinGenerate(), Engine.getMaxGenerate());
            System.out.println("Question: " + number);
            var answer = Engine.getUserInput();
            var trueAnswer = IsPrime.isPrime(number);
            System.out.println("Your answer: " + answer);
            if ((answer.equals("yes") && trueAnswer) || (answer.equals("no") && !trueAnswer)) {
                System.out.println("Correct!");
            } else if (answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(, correct answer was 'no'");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            } else {
                System.out.println("'no' is wrong answer ;(, correct answer was 'yes'");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
