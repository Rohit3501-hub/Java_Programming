package RideBook;

public class BikeRide extends Ride {
    public String bikeType = "Bike";
    public int baseFare = 30;
    public int perKm = 8;

    public BikeRide(int rideId,String customerName, String pickupLocation, String destination, int distance, String bikeType, int baseFare) {
        super(rideId, customerName, pickupLocation, destination, distance);

    }
    public void calculateFare() {
        System.out.println("Calculating fare for the bike");
        int totalfare=baseFare+(getDistance()*perKm);


        System.out.println("Bike type: " + bikeType);
        System.out.println("Total fare: " + totalfare);
        System.out.println("Distance: " + getDistance());
        System.out.println("Base fare: " + baseFare);
        System.out.println("***************************************");
    }
}
