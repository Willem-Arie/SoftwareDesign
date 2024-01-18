public class NumberGuessingGameProxy implements Game {
    private NumberGuessingGame realGame;

    public NumberGuessingGameProxy(GameConfig config) {
        this.realGame = new NumberGuessingGame(config);
    }

    public void play() {
        System.out.println("Proxy: Checking user credentials..");
        realGame.play();
    }
}
