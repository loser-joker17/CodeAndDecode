package LLD.StrategyPattern.CabBookingProblem;

public class Bike implements RideStrategy {

    @Override
    public String getRideType() {
        return "Bike";
    }
    @Override
    public double calculateFare(double distanceInKm , double timeInMin){
        double baseFare = 5;     // per km
        double perMin = 1;       // per min
        return 20 + (baseFare * distanceInKm) + (perMin * timeInMin);
    }
}
