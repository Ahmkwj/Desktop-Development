/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 21-09-2025-10h-46m
*/

package qa.udst.ecommerce.model;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order {

    private int orderId;
    private ArrayList<BaseProduct> products = new ArrayList<>();
    private double totalPrice;
    private Customer customer;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addProduct(BaseProduct product) {
        products.add(product);
    }

    public void calculateTotal() {
        totalPrice = 0;
        for (BaseProduct product : products) {
            totalPrice += product.getPrice();
        }
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        if (customer != null) {
            customer.displayCustomerInfo();
        }
        for (BaseProduct product : products) {
            product.displayInfo();
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}
