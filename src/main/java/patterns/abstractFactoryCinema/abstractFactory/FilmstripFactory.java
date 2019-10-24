package patterns.abstractFactoryCinema.abstractFactory;

import patterns.abstractFactoryCinema.domainInterfaces.Audiotrack;
import patterns.abstractFactoryCinema.domainInterfaces.Subtitles;

public interface FilmstripFactory {

    Audiotrack createAudiotrack();

    Subtitles createSubtitles();
}
