package patterns.stateGrant.states;

import patterns.stateGrant.Grant;

public class Confirmed implements Grant {


    @Override
    public void changeState() {
        System.out.println("Congratulations! Your grant is created. ");
    }


}
