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

    public int getId() {
        return id;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be empty");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
        }
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product Details:");
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
    }
}
