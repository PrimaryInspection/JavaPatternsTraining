package patterns.observerPostOffice;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> newspapers);

}
