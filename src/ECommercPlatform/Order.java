package ECommercPlatform;

public abstract class Order {
    private int orderId;
    private String customerName;
    private String productName;
    private int quantity;
    private double totalAmount;
    private String orderStatus;

    public Order(int orderId, String customerName, String productName, int quantity, double totalAmount, String orderStatus) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    public void displayOrderDetails() {
        System.out.println("******************");
        System.out.println("Order ID::" + orderId +
                "Customer Name" + customerName +
                "Product Name::" + productName +
                "Quantity  ::" + quantity +
                "totalAmount ::" + totalAmount +
                "Order Status ::" + orderStatus
        );
    }

    abstract void PlaceOrder();


    abstract void CancelOrder();


    abstract void Calculate();
}
