package qa.udst.ecommerce.model;

import java.util.ArrayList;

public class Order {
    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<BaseProduct> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
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
