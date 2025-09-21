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

public class DigitalProduct extends BaseProduct {
    private String url;

    @Override
    public void displayInfo() {
        System.out.println("Digital Product:");
        System.out
                .println("Product: ID: " + this.getId() + ", Name: " + this.getName() + ", Price: $" + this.getPrice());
        System.out.println("URL: " + this.url);
    }

    @Override
    public void displayDetails() {
        System.out.println("Digital Product Details:");
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice() + "$");
        System.out.println("URL: " + url);
    }

    @Override
    public double calculateDiscount(double percentage) {
        return getPrice() * (percentage / 100.0);
    }
}
