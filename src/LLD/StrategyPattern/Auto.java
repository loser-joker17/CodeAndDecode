package LLD.StrategyPattern;

public class Auto implements RideStrategy{
    @Override
    public String getRideType() {
        return "Auto";
    }
    @Override
    public double calculateFare(double distanceInKm , double timeInMin){
        double baseFare = 5;     // per km
        double perMin = 1;       // per min

        return 10 + (baseFare * distanceInKm) + (perMin * timeInMin);
    }
}
