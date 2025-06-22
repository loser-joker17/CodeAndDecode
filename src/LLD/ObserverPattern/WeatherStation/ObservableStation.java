package LLD.ObserverPattern.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class ObservableStation implements subject{

    private List<Observer> observerList = new ArrayList<>();
    private String weather;
    private String temp;
    @Override
    public void add(Observer observer){
        observerList.add(observer);
    }
    @Override
    public void remove(Observer observer){
        observerList.remove(observer);
    }
    @Override
    public void notifyObservers(){
        for(Observer observer1: observerList){
          observer1.update();
        }
    }
    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setTemp(String temp){
        this.temp = temp;
        notifyObservers();
    }
    public String getTemp() {
        return temp;
    }

    public String getWeather() {
        return weather;
    }
}
