package patterns.stateGrant.states;

import patterns.stateGrant.Grant;

public class Reviewed implements Grant {
    @Override
    public void changeState() {
        System.out.println("Grant is reviewing now..");
    }
}
