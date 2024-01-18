public class GameConfigBuilder {
    private int minRange = 1;
    private int maxRange = 100;

    public GameConfigBuilder setMinRange(int minRange) {
        this.minRange = minRange;
        return this;
    }

    public GameConfigBuilder setMaxRange(int maxRange) {
        this.maxRange = maxRange;
        return this;
    }

    public GameConfig build() {
        return new GameConfig(minRange, maxRange);
    }
}
