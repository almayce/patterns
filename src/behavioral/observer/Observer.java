package behavioral.observer;

import java.util.List;

/**
 * Created by almayce on 07.04.17.
 */
public interface Observer {
    public void handleEvent(List<String> vacancies);
}
