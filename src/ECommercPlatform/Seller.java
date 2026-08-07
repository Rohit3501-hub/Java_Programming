package ECommercPlatform;

public class Seller {
    private int sellerId;
    private String sellerName;
    private String companyName;
    private double rating;

    public Seller(int sellerId, String sellerName, String companyName, double rating) {
        this.sellerId = sellerId;
        this.sellerName = sellerName;
        this.companyName = companyName;
        this.rating = rating;
    }

    public void displaySeller() {
        System.out.println("********************");
        System.out.println("Seller ID ::" + sellerId +
                "Seller Name ::" + sellerId +
                "Company Name::" + companyName +
                "Rating ::" + rating
        );
    }
}
