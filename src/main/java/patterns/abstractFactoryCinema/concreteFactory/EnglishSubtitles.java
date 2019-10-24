package patterns.abstractFactoryCinema.concreteFactory;

import patterns.abstractFactoryCinema.domainInterfaces.Subtitles;

public class EnglishSubtitles implements Subtitles {
    @Override
    public void showSubtitles() {
        System.out.println("There are English subtitles");
    }
}
