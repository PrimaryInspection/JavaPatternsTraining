package patterns.abstractFactoryCinema.domain;

import patterns.abstractFactoryCinema.domainInterfaces.Audiotrack;
import patterns.abstractFactoryCinema.domainInterfaces.Subtitles;
import patterns.abstractFactoryCinema.abstractFactory.FilmstripFactory;

public class Filmstrip {

    private String title;

    private Subtitles subtitles;

    private Audiotrack audiotrack;

    public Filmstrip(String title,FilmstripFactory filmstripFactory) {
        this.title = title;
        subtitles=filmstripFactory.createSubtitles();
        audiotrack=filmstripFactory.createAudiotrack();
    }

    public void showFilm(){


        System.out.println("Title : " + title);
        subtitles.showSubtitles();
        audiotrack.playMusic();


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Subtitles getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(Subtitles subtitles) {
        this.subtitles = subtitles;
    }

    public Audiotrack getAudiotrack() {
        return audiotrack;
    }

    public void setAudiotrack(Audiotrack audiotrack) {
        this.audiotrack = audiotrack;
    }
}
