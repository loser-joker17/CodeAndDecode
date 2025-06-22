package LLD.ObserverPattern.WeatherStation;

public interface subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
