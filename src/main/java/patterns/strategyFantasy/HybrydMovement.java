package patterns.strategyFantasy;

public class HybrydMovement implements Activity {
    @Override
    public void movement(String name) {
      System.out.println("I'm " + name + " and i'm flying and walking");
    }
}
