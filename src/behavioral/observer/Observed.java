package behavioral.observer;

/**
 * Created by almayce on 07.04.17.
 */
public interface Observed {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
