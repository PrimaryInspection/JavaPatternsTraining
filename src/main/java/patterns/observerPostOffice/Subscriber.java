package patterns.observerPostOffice;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> newspapers) {
        System.out.println("Dear, " + name + " we have some change in your newspapers subscription\n " + newspapers +
                "\n========================================================\n"
        );
    }
}
