package patterns.abstractFactoryCinema.concreteFactory;

import patterns.abstractFactoryCinema.domainInterfaces.Audiotrack;

public class UkrainianAudotrack implements Audiotrack {
    @Override
    public void playMusic() {
        System.out.println("Playing Ukrainian music");
    }
}
