import java.util.Scanner;

public class HumanGuessingStrategy implements GuessingStrategy {
    public int guessNumber(GameConfig config) {
        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.print("Enter your guess between " + config.getMinRange() + " And " + config.getMaxRange() + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }
            guess = scanner.nextInt();
        }
        while (guess < config.getMinRange() || guess > config.getMaxRange());

        return guess;
    }
}
