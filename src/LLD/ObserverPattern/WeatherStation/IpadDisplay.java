package LLD.ObserverPattern.WeatherStation;

public class IpadDisplay implements Observer{

    ObservableStation observableStation = new ObservableStation();

    public IpadDisplay(ObservableStation observableStation) {
        this.observableStation = observableStation;
    }
    @Override
    public void update(){
        System.out.println("Weather is on IpadDisplay :- "+ observableStation.getWeather() + "And Temp is :- " + observableStation.getTemp());
    }
}
