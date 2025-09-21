/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 21-09-2025-10h-46m
*/

package qa.udst.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class BaseProduct implements Product {
    private int id;
    private String name;
    private double price;
    private ProductCategory category;

    @Override
    public abstract void displayInfo();

    public abstract double calculateDiscount(double percentage);

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be empty");
        }
        this.name = name;
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
