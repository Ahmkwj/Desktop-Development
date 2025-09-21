/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 21-09-2025-10h-46m
*/

package qa.udst.ecommerce;

import qa.udst.ecommerce.model.*;
import java.util.*;

public class WelcomeECommerce {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("   Welcome to the E-Commerce System   ");
        System.out.println("==============================\n");

        Customer customer = new Customer(101, "Ali Ahmed", "ali.ahmed@example.com");
        Order order = new Order(1, customer);

        List<BaseProduct> products = new ArrayList<>();
        PhysicalProduct laptop = new PhysicalProduct(1, "Laptop", 1200.00, 2.3);
        DigitalProduct talabat = new DigitalProduct(2, "Talabat", 800.00, "http://example.qa");
        products.add(laptop);
        products.add(talabat);

        System.out.println("Product Details:");
        printProductTable(products);

        System.out.println("\nDiscounts (10%):");
        printDiscountTable(products, 10);

        ProductInventory inventory = new ProductInventory();
        inventory.addProduct("1", laptop, ProductCategory.PHYSICAL);
        inventory.addProduct("2", talabat, ProductCategory.DIGITAL);

        System.out.println("\nProducts in PHYSICAL Category:");
        printProductTable(inventory.getProductsByCategory(ProductCategory.PHYSICAL));

        try {
            inventory.getProduct("974");
        } catch (ProductNotFoundException e) {
            System.out.println("[Exception] " + e.getMessage());
        }

        System.out.println("\nShipping & Tracking for Physical Products:");
        System.out.printf("| %-15s | %-14s | %-18s |\n", "Product", "Shipping Cost", "Tracking Number");
        System.out.println("|-----------------|---------------|--------------------|");
        System.out.printf("| %-15s | $%-13.2f | %-18s |\n", laptop.getName(), laptop.calculateShippingCost(),
                laptop.generateTrackingNumber());

        laptop.setPrice(1100.00);
        System.out.println("\nUpdated Laptop Price: $" + laptop.getPrice());

        for (BaseProduct product : products) {
            order.addProduct(product);
        }
        order.calculateTotal();
        System.out.println("\nOrder Summary:");
        printOrderTable(order);

        Invoice invoice = new Invoice(5001, order, new Date());
        invoice.generateInvoice();
        System.out.println("\nInvoice:");
        printInvoiceTable(invoice);
    }

    // Helper to print product table
    private static void printProductTable(List<BaseProduct> products) {
        System.out.printf("| %-3s | %-15s | %-8s | %-10s |\n", "ID", "Name", "Price", "Category");
        System.out.println("|-----|-----------------|----------|------------|");
        for (BaseProduct p : products) {
            System.out.printf("| %-3d | %-15s | $%-7.2f | %-10s |\n", p.getId(), p.getName(), p.getPrice(),
                    p.getCategory());
        }
    }

    // Helper to print discount table
    private static void printDiscountTable(List<BaseProduct> products, double percent) {
        System.out.printf("| %-15s | %-8s | %-10s |\n", "Name", "Price", "Discount");
        System.out.println("|-----------------|----------|------------|");
        for (BaseProduct p : products) {
            double discount = p.calculateDiscount(percent);
            System.out.printf("| %-15s | $%-7.2f | $%-9.2f |\n", p.getName(), p.getPrice(), discount);
        }
    }

    // Helper to print order table
    private static void printOrderTable(Order order) {
        Customer c = order.getCustomer();
        System.out.println("Customer:");
        System.out.printf("| %-3s | %-15s | %-25s |\n", "ID", "Name", "Email");
        System.out.println("|-----|-----------------|---------------------------|");
        System.out.printf("| %-3d | %-15s | %-25s |\n", c.getCustomerId(), c.getName(), c.getEmail());
        System.out.println("\nProducts:");
        printProductTable(order.getProducts());
        System.out.println("\nTotal Price: $" + String.format("%.2f", order.getTotalPrice()));
    }

    // Helper to print invoice table
    private static void printInvoiceTable(Invoice invoice) {
        System.out.printf("| %-10s | %-10s |\n", "Invoice ID", "Date");
        System.out.println("|------------|------------|");
        System.out.printf("| %-10d | %-10s |\n", invoice.getInvoiceId(), invoice.getDate());
        if (invoice.getOrder() != null) {
            System.out.println("\nOrder Details:");
            printOrderTable(invoice.getOrder());
        }
    }
}
