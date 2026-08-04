package fooddeliverysystem1;

public class DessertOrder extends Order {
    private int priceItem;

    public DessertOrder(int orderId, String customerName, String restaurantName, int quantity, int priceItem) {
        super(orderId, customerName, restaurantName, quantity);
        this.priceItem = priceItem;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare the order");

    }

    @Override
    public void deliver() {

        System.out.println("Deliver the order");
    }

    @Override
    public void calculateBill() {
        //int pricePerItem;
        int totalBill = getQuantity()* priceItem;
        System.out.println("Total Bill : " + totalBill);
    }
}