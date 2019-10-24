package patterns.mementoGame;

public class Game {
    private String level;
    private  int score;



    public void setLevelAndScore(String level, int score) {
        this.level = level;
        this.score = score;
    }

    public void load(Save save){
        level = save.getLevel();
        score = save.getScore();
    }

    public Save save(){
        return new Save(level,score);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", score=" + score +
                '}';
    }
}
