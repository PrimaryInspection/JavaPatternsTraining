package patterns.observerPostOffice;

import java.util.List;

public interface Observed {
    void addObserver(Observer observed);

    void removeObserver(Observer observer);

    void notifyObserver();


}
