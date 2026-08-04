package fooddeliverysystem1;

public abstract class Order {
    private int orderId;
    private String customerName;
    private String RestaurantName;
    private int quantity;

    public Order(int orderId, String customerName, String restaurantName, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        RestaurantName = restaurantName;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Restaurant Name: " + RestaurantName);
        System.out.println("Quantity: " + quantity);
    }

    public abstract void prepare();
    public abstract void deliver();
    public abstract void calculateBill();

}
