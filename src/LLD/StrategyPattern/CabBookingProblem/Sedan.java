package LLD.StrategyPattern.CabBookingProblem;

public class Sedan implements RideStrategy {

    @Override
    public String getRideType() {
        return "SedanCar";
    }
    @Override
    public double calculateFare(double distanceInKm , double timeInMin){
        double baseFare = 5;     // per km
        double perMin = 1;       // per min
        return 40 + (baseFare * distanceInKm) + (perMin * timeInMin);
    }
}
