package LLD.ObserverPattern.WeatherStation;

public class PhoneDisplay implements Observer{

    ObservableStation observableStation = new ObservableStation();
    public PhoneDisplay(ObservableStation observableStation) {
        this.observableStation = observableStation;
    }
    @Override
    public void update(){
        System.out.println("Weather is Phone Display:- " + observableStation.getWeather()+ "And Temp is :- " + observableStation.getTemp());
    }
}
