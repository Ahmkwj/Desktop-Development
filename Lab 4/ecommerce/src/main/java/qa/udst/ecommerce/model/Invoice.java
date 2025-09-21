/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 21-09-2025-10h-46m
*/

/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 14-09-2025-08h-25m
*/

package qa.udst.ecommerce.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {

    private int invoiceId;
    private Order order;
    private Date date;

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
