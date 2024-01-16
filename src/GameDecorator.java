// GameDecorator.java
public class GameDecorator implements Game {
    private Game game;

    public GameDecorator(Game game) {
        this.game = game;
    }

    @Override
    public void play() {
        game.play();
    }
}
