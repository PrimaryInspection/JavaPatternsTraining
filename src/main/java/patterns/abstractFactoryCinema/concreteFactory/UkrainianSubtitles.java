package patterns.abstractFactoryCinema.concreteFactory;

import patterns.abstractFactoryCinema.domainInterfaces.Subtitles;

public class UkrainianSubtitles implements Subtitles {
    @Override
    public void showSubtitles() {
        System.out.println("There are Ukrainian subtitles");
    }
}
