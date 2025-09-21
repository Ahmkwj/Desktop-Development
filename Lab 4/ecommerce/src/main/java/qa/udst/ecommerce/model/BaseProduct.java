package qa.udst.ecommerce.model;

import lombok.Data;

@Data

public abstract class BaseProduct implements Product {

    private int id;
    private String name;
    private double price;
    private ProductCategory category;

    protected BaseProduct(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public abstract void displayInfo();

    public abstract double calculateDiscount(double percentage);

    public void displayDetails() {
        System.out.println("Product Details:");
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
    }
}
