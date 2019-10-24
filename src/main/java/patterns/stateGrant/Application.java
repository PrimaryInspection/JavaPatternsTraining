package patterns.stateGrant;

import patterns.stateGrant.states.Created;

public class Application {
    public static void main(String[] args) {
        Grant grant = new Created();
        Ministery ministery = new Ministery();
        ministery.setGrantState(grant);

        for (int i =0; i<3; i++){
            ministery.proccess();
            ministery.nextGrantState();
        }
    }

}
