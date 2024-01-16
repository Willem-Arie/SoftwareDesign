// ScoreboardDecorator.java
public class ScoreboardDecorator extends GameDecorator {
    public ScoreboardDecorator(Game game) {
        super(game);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Scoreboard: Player 1 - 100 points, Player 2 - 80 points");
    }
}
