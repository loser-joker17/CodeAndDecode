package LLD.StrategyPattern;

public class RideContext {

    private RideStrategy rideStrategy;

    public void setRideStrategy(RideStrategy rideStrategy) {
        this.rideStrategy = rideStrategy;
    }

    public void bookRide(double distance , double time){
        if(rideStrategy==null){
            System.out.println("Ride is not selected");
            return;
        }
        System.out.println("Ride Type is :- "+ rideStrategy.getRideType());
        double fare = rideStrategy.calculateFare(distance, time);
        System.out.println("Distance: " + distance + " km, Time: " + time + " min");
        System.out.println("Total Fare: ₹" + fare);
        System.out.println("-------------------------");
    }
}
