package LLD.StrategyPattern;

public class RideClient {
    public static void main(String[] args){
          RideContext rideContext = new RideContext();

          rideContext.setRideStrategy(new Bike());
          rideContext.bookRide(10,30);

        rideContext.setRideStrategy(new Auto());
        rideContext.bookRide(10,30);

        rideContext.setRideStrategy(new miniCab());
        rideContext.bookRide(10,30);

        rideContext.setRideStrategy(new Sedan());
        rideContext.bookRide(10,30);
    }
}
