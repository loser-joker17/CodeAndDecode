package LLD.StrategyPattern.CabBookingProblem;

public interface RideStrategy {

    double calculateFare(double distanceInKm , double timeInMin);
    String getRideType();

}
