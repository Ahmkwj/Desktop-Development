package qa.udst.ecommerce.model;

public class DigitalProduct extends BaseProduct {
    private String url;

    public DigitalProduct(int id, String name, double price, String url) {
        super(id, name, price);
        this.url = url;
    }

    @Override
    public void displayInfo() {
        System.out.println("Digital Product:");
        System.out.println("Product: ID: " + this.getId() + ", Name: " + this.getName() + ", Price: $" + this.getPrice());
        System.out.println("URL: " + this.url);
    }

    @Override
    public double calculateDiscount(double percentage) {
        return getPrice() * (percentage / 100.0);
    }
}
