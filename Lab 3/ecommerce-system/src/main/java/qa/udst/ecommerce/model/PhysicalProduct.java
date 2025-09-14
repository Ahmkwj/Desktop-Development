package qa.udst.ecommerce.model;

public class PhysicalProduct extends BaseProduct implements Shippable {
    private double weight;

    public PhysicalProduct(int id, String name, double price, double weight) {
        super(id, name, price);
        setWeight(weight);
        setCategory(ProductCategory.PHYSICAL);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("Weight cannot be negative");
            }
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

    @Override
    public double calculateShippingCost() {
        return weight * 2;
    }

    @Override
    public String generateTrackingNumber(){
        return "TRACK-" + getId();
    }

    @Override
    public void displayDetails() {
        System.out.println("Physical Product Details:");
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Shipping Cost: $" + calculateShippingCost());
        System.out.println("Tracking Number: " + generateTrackingNumber());
    }
}
