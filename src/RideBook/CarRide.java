package RideBook;

public class CarRide extends Ride{
    public String carType = "Car";
    public int baseFare = 8;
    public int kmFare= 15;

    public CarRide(int rideId, String customerName, String pickupLocation, String destination, int distance, String carType, int baseFare) {
        super(rideId, customerName, pickupLocation, destination, distance);
        this.carType = carType;
        this.baseFare = baseFare;
    }
    public void calculateFare(){
        System.out.println("Calculating fare for the car");
        int totalfare =baseFare+(getDistance()*kmFare);

        System.out.println("Car type: " + carType);
        System.out.println("Total fare: " + totalfare);
        System.out.println("Distance: " + getDistance());
        System.out.println("Base fare: " + baseFare);
        System.out.println("***************************************");
        }
}
