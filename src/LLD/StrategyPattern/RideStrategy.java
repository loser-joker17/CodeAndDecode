package LLD.StrategyPattern;

public interface RideStrategy {

    double calculateFare(double distanceInKm , double timeInMin);
    String getRideType();

}
