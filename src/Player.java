// Player.java
public class Player implements Observer {
    private String name;
    private int guessedNumber;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update(int generatedNumber, int guessedNumber) {
        this.guessedNumber = guessedNumber; // Correctly set the guessed number
        System.out.println(name + " received an update: " + this.guessedNumber);
    }

    public int getGuessedNumber() {
        return guessedNumber;
    }

    public String getName() {
        return name;
    }
}
