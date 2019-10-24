package patterns.abstractFactoryCinema.abstractFactory;

import patterns.abstractFactoryCinema.domainInterfaces.Audiotrack;
import patterns.abstractFactoryCinema.domainInterfaces.Subtitles;
import patterns.abstractFactoryCinema.concreteFactory.UkrainianAudotrack;
import patterns.abstractFactoryCinema.concreteFactory.UkrainianSubtitles;

public class UkrainianFactory implements FilmstripFactory {

    @Override
    public Audiotrack createAudiotrack() {
        return new UkrainianAudotrack();
    }

    @Override
    public Subtitles createSubtitles() {
        return new UkrainianSubtitles();
    }
}
