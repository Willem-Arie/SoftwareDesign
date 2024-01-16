// NumberGenerator.java
import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(int generatedNumber) {
        for (Observer observer : observers) {
            observer.update(generatedNumber, observer instanceof Player ? ((Player) observer).getGuessedNumber() : -1);
        }

        determineClosestPlayer(generatedNumber);
    }

    private void determineClosestPlayer(int generatedNumber) {
        int minDifference = Integer.MAX_VALUE;
        Player closestPlayer = null;

        for (Observer observer : observers) {
            if (observer instanceof Player) {
                Player player = (Player) observer;
                int guessedNumber = player.getGuessedNumber();
                int difference = Math.abs(generatedNumber - guessedNumber);

                System.out.println(player.getName() + " Guessed: " + guessedNumber + ", Difference: " + difference);

                if (difference < minDifference) {
                    minDifference = difference;
                    closestPlayer = player;
                }
            }
        }

        if (closestPlayer != null) {
            System.out.println("Player " + closestPlayer.getName() + " is closer to the number!");
            System.out.println("Closest Player's Name: " + closestPlayer.getName());
        } else {
            System.out.println("No players to compare.");
        }
    }


    public void generateNumber() {
        int generatedNumber = (int) (Math.random() * 100);
        System.out.println("Generated number: " + generatedNumber);

        notifyObservers(generatedNumber);
    }
}
