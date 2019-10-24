package patterns.flyweightBactery;

public class StrongBactery implements Bactery{
    int count;

    public StrongBactery(int count) {
        this.count = count;
    }


    @Override
    public int reproduction(int multiplier) {
        count *= multiplier;
        System.out.println("Произошло деление Бактерии на 2");
        return count;
    }

    @Override
    public String toString() {
        return "StupidBactery{" +
                "count=" + count +
                '}';
    }

}
