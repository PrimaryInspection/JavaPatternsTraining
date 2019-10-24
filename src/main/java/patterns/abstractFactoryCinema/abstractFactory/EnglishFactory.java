package patterns.abstractFactoryCinema.abstractFactory;

import patterns.abstractFactoryCinema.domainInterfaces.Audiotrack;
import patterns.abstractFactoryCinema.domainInterfaces.Subtitles;
import patterns.abstractFactoryCinema.concreteFactory.EnglishAudiotrack;
import patterns.abstractFactoryCinema.concreteFactory.EnglishSubtitles;

public class EnglishFactory implements FilmstripFactory {
    @Override
    public Audiotrack createAudiotrack() {
        return new EnglishAudiotrack();
    }

    @Override
    public Subtitles createSubtitles() {
        return new EnglishSubtitles();
    }
}
