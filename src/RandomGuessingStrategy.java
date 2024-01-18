public class RandomGuessingStrategy implements GuessingStrategy {
    public int guessNumber(GameConfig config) {
        return (int) (Math.random() * (config.getMaxRange() - config.getMinRange() + 1) + config.getMaxRange());
    }
}
