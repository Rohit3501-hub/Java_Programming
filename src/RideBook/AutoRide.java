package RideBook;

public class AutoRide extends Ride{
    public String RideType = "Auto";
    public int baseFare = 50;
    public int perKm = 10;


    public AutoRide(int rideId, String customerName, String pickupLocation, String destination, int distance, String rideType, int baseFare) {
        super(rideId, customerName, pickupLocation, destination,  distance);
        RideType = rideType;
        this.baseFare = baseFare;
    }
    public void calculateFare(){
        System.out.println("Calculating fare for the auto");
        int totalfare = baseFare + (getDistance() *perKm);
        System.out.println("Ridetype "+ RideType);
        System.out.println("total fare :"+ totalfare);
        System.out.println("Distance : "+ getDistance());
        System.out.println("Base fare : "+ baseFare);
        System.out.println("***************************************");

    }
}
