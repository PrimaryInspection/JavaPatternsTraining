package patterns.observerPostOffice;

import java.util.ArrayList;
import java.util.List;

public class PublishingOffice implements Observed {

    public List<String> newspapers = new ArrayList<String>();

    public List<Observer> subscribers = new ArrayList<Observer>();

    public void addNewspaper(String newspapaper){
        newspapers.add(newspapaper);
        notifyObserver();
    }

    public void removeNewspaper(String newspapaper){
        newspapers.remove(newspapaper);
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observed) {
        this.subscribers.add(observed);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: subscribers) {
            observer.handleEvent(this.newspapers);
        }
    }
}
