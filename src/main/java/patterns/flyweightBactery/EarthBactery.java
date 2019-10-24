package patterns.flyweightBactery;

public class EarthBactery implements Bactery{
    int count;

    public EarthBactery(int count) {
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
