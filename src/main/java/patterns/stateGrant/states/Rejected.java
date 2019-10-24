package patterns.stateGrant.states;

import patterns.stateGrant.Grant;

public class Rejected implements Grant {
    @Override
    public void changeState() {
        System.out.println("Grant was rejected.");
    }
}
