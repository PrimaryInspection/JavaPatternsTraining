package patterns.flyweightBactery;

import java.util.HashMap;
import java.util.Map;

public class BacteryFactory {
    private static final Map<String ,Bactery> bacteries = new HashMap<String, Bactery>();

    public Bactery getBacteriesByCriteria(String criteria){
        Bactery bactery = bacteries.get(criteria);

        if(bactery == null){
            switch (criteria){
                case "stupid":
                    System.out.println("Reproducting stupid bacteria..");
                    bactery = new StupidBactery(2);
                    break;
                case "strong":
                    System.out.println("Reproducting strong bacteria..");
                    bactery = new StrongBactery(12);
                    break;
                case "earth":
                    System.out.println("Reproducting earth bacteria..");
                    bactery = new EarthBactery(6);
                    break;
            }
            bacteries.put(criteria,bactery);
        }
        return bactery;
    }
}
