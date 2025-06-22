package LLD.ObserverPattern.WeatherStation;

public class WeatherClient {
    public static void main(String args[]){

        ObservableStation observableStation = new ObservableStation();

        observableStation.add(new PhoneDisplay(observableStation));
        observableStation.add(new IpadDisplay(observableStation));

        observableStation.setWeather("Cloudy");
        observableStation.setTemp("24");

    }
}
