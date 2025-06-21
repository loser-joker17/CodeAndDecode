package LLD.StrategyPattern;

public class miniCab implements RideStrategy{

    @Override
    public String getRideType() {
        return "miniCab";
    }
    @Override
    public double calculateFare(double distanceInKm , double timeInMin){
        double baseFare = 5;     // per km
        double perMin = 1;       // per min
        return 30 + (baseFare * distanceInKm) + (perMin * timeInMin);
    }
}
