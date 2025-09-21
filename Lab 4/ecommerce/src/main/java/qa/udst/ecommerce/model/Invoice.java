/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 14-09-2025-08h-25m
*/

package qa.udst.ecommerce.model;

import java.util.Date;

public class Invoice {

    private int invoiceId;
    private Order order;
    private Date date;

    public Invoice(int invoiceId, Order order, Date date) {
        this.invoiceId = invoiceId;
        this.order = order;
        this.date = date;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public Date getDate() {
        return date;
    }

    public Order getOrder() {
        return order;
    }

    public void generateInvoice() {
        order.calculateTotal();
    }

    public void displayInvoice() {
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Date: " + date);
        if (order != null) {
            order.displayOrder();
        }
    }
}
