package ECommercPlatform;

public class Product {
    private int productId;
    private String productName;
    private String category;
    private String brand;
    private int price;
    private String quantityInStock;
    private int sellerId;
    private double rating;

    public Product(int productId, String productName, String category, String brand, int price, String quantityInStock, int sellerId, double rating) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.sellerId = sellerId;
        this.rating = rating;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(String quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void displayProduct() {
        System.out.println("****************************");
        System.out.println("Product ID ::" + productId +
                "\nProduct Name ::" + productName +
                "\nCategory ::" + category +
                "\n Brand :: " + brand +
                "\n Price ::" + price +
                "\n Quantity In Stock ::" + quantityInStock +
                "\nsellerId::" + sellerId +
                "\nRating ::" + rating
          );

    }
}
