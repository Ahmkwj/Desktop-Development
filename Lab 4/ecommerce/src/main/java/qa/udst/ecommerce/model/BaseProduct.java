package qa.udst.ecommerce.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class BaseProduct {

    private int id;
    private String name;
    private double price;

    public abstract double calculateDiscount(double percentage);

    public void displayDetails() {
        System.out.println("Product Details:");
        System.out.println("Name: " + this.getName());
        System.out.println("Price: $" + this.getPrice());
    }
}