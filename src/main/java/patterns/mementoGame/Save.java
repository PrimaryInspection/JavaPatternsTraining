package patterns.mementoGame;

public class Save {

    private final String level;
    private final int score;

    public Save(String level, int score) {
        this.level = level;
        this.score = score;
    }

    public String getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}
