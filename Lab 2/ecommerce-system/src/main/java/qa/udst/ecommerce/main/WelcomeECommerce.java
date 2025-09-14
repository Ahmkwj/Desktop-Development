package qa.udst.ecommerce.main;

import qa.udst.ecommerce.model.*;
import java.util.*;

public class WelcomeECommerce {
    public static void main(String[] args) {
        System.out.println("Welcome to the E-Commerce System!");

        // Create Customer
        Customer customer = new Customer(101, "Ali Ahmed", "ali.ahmed@example.com");

        // Create Order and associate Customer
        Order order = new Order(1, customer);

        // Demonstrate polymorphism
        List<BaseProduct> products = new ArrayList<>();
        products.add(new PhysicalProduct(1, "Laptop", 1200.00, 2.3));
        products.add(new DigitalProduct(2, "Talabat", 800.00, "http://example.qa"));

        for (BaseProduct product : products) {
            product.displayInfo();
            double discount = product.calculateDiscount(10); // 10% discount
            System.out.println("Discount (10%): $" + discount);
        }

        // Add products to order
        for (BaseProduct product : products) {
            order.addProduct(product);
        }
        order.calculateTotal();
        order.displayOrder();

        // Create and display Invoice
        Invoice invoice = new Invoice(5001, order, new Date());
        invoice.generateInvoice();
        invoice.displayInvoice();
    }
}
