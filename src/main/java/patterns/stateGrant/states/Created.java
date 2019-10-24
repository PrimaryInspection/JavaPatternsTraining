package patterns.stateGrant.states;

import patterns.stateGrant.Grant;

public class Created implements Grant {
    @Override
    public void changeState() {
        System.out.println("Grant application is created. ");
    }
}
