package patterns.abstractFactoryCinema.concreteFactory;

import patterns.abstractFactoryCinema.domainInterfaces.Audiotrack;

public class EnglishAudiotrack implements Audiotrack {
    @Override
    public void playMusic() {
        System.out.println("Playing English music");
    }
}
