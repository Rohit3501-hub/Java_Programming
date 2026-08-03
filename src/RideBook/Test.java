package RideBook;

public class Test {
    public static void main(String [] args) {
            Ride ride1 = new AutoRide(1001, "Sujay", "Location Mumbai", "Pune", 70, "Auto", 50);
            Ride br = new BikeRide(1002, "Sujay", "Location Mumbai", "Pune", 70, "Bike", 30);
            Ride ride2 = new CarRide(1003, "Sujay", "Location Mumbai", "Pune", 70, "Car", 80);
            ride1.calculateFare();
            br.calculateFare();
            ride2.calculateFare();

    }
}
