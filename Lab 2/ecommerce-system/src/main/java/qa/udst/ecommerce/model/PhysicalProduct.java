package qa.udst.ecommerce.model;

public class PhysicalProduct extends BaseProduct {
    private double weight;

    public PhysicalProduct(int id, String name, double price, double weight) {
        super(id, name, price);
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Physical Product:");
        System.out.println("Product: ID: " + this.getId() + ", Name: " + this.getName() + ", Price: $" + this.getPrice());
        System.out.println("Weight: " + this.weight + " kg");
    }

    @Override
    public double calculateDiscount(double percentage) {
        return getPrice() * (percentage / 100.0);
    }
}
