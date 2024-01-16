// Main.java
public class Main {
    public static void main(String[] args) {
        GameManager gameManager = GameManager.getInstance();

        // Creational Design Patterns
        GameConfig config = new GameConfigBuilder().setMinRange(1).setMaxRange(100).build();

        // Structural Design Patterns
        Game game = new NumberGuessingGame(config);
        game.play();

        Game decoratedGame = new ScoreboardDecorator(new NumberGuessingGame(config));
        decoratedGame.play();

        Game proxyGame = new NumberGuessingGameProxy(config);
        proxyGame.play();

        // Behavioral Design Patterns
        NumberGenerator numberGenerator = new NumberGenerator();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        numberGenerator.addObserver(player1);
        numberGenerator.addObserver(player2);

        // Human player guessing
        GuessingStrategy humanGuessingStrategy = new HumanGuessingStrategy();
        int userGuess = humanGuessingStrategy.guessNumber(config);

        // Computer player guessing
        GuessingStrategy computerGuessingStrategy = new RandomGuessingStrategy();
        int computerGuess = computerGuessingStrategy.guessNumber(config);

        System.out.println("User guessed: " + userGuess);
        System.out.println("Computer guessed: " + computerGuess);

        numberGenerator.generateNumber();
    }
}
