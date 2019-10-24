package patterns.stateGrant.states;

import patterns.stateGrant.Grant;

public class Recalled implements Grant {
    @Override
    public void changeState() {
        System.out.println("Grant was recalled.");
    }
}
