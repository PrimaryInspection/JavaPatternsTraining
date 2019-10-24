package patterns.flyweightBactery;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        BacteryFactory bacteryFactory = new BacteryFactory();
        List<Bactery> bacteryList = new ArrayList<>();

        bacteryList.add(bacteryFactory.getBacteriesByCriteria("strong"));
        bacteryList.add(bacteryFactory.getBacteriesByCriteria("strong"));
        bacteryList.add(bacteryFactory.getBacteriesByCriteria("strong"));
        bacteryList.add(bacteryFactory.getBacteriesByCriteria("stupid"));
        bacteryList.add(bacteryFactory.getBacteriesByCriteria("stupid"));
        bacteryList.add(bacteryFactory.getBacteriesByCriteria("earth"));
        bacteryList.add(bacteryFactory.getBacteriesByCriteria("earth"));


        for (Bactery bactery:bacteryList) {
            System.out.println(bactery.getClass().getSimpleName()+"[" + bactery.hashCode() + "]" + ":" + bactery.reproduction(2));
            Thread.sleep(1500);
        }
    }
}
