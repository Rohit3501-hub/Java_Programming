package JavaAssessmentPaper;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void calculateTotalPrice() {
        double totalamount = price * quantity;
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalamount);
        System.out.println("---------------********Happy Customer********--------------");
    }

    public static void main(String[] args) {
        Product[] p1 = {
                new Product(101, "Mouse", 600, 3),
                new Product(102, "Keyboard", 800, 2),
                new Product(103, "Monitor", 9000, 1)
        };


        for (Product product : p1) {
            product.calculateTotalPrice();
        }
    }
}


