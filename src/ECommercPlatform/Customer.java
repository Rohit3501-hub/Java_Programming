package ECommercPlatform;

public class Customer {
    private int customerId;
    private String customerName;
    private int mobileNumber;
    private String email;
    private String address;

    public Customer(int customerId, String customerName, int mobileNumber, String email, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    public void displayCustomer() {
        System.out.println("***************************");
        System.out.println("Customet ID::" + customerId +
                "Customer Name ::" + customerName +
                "Mobile Number ::" + mobileNumber +
                "Email::" + email +
                "Address ::" + address

        );

    }
}
