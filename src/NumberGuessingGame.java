public class NumberGuessingGame implements Game {
    private GameConfig config;

    public NumberGuessingGame(GameConfig config) {
        this.config = config;
    }

    @Override
    public void play() {
        System.out.println("Number Guessing Game: Guess a number between "
                + config.getMinRange() + " and " + config.getMaxRange());
    }
}
