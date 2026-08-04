package fooddeliverysystem1;

public class VegOrder extends Order{
    private int pricePerItem;

    public VegOrder(int orderId, String customerName, String restaurantName, int quantity, int pricePerItem) {
        super(orderId, customerName, restaurantName, quantity);
        this.pricePerItem = pricePerItem;
    }


    @Override
    public void prepare() {
        System.out.println("VegOrder Prepare..");
    }

    @Override
    public void deliver() {
        System.out.println("VegOrder delivered...");
    }

    @Override
    public void calculateBill() {
        int totalBill=getQuantity()*pricePerItem;
        System.out.println("Total Bill : "+totalBill);
    }
}
