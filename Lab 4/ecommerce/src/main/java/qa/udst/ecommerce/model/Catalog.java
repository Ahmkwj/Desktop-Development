/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 21-09-2025-10h-46m
*/

package qa.udst.ecommerce.model;

import java.util.ArrayList;

public class Catalog {
    private ArrayList<BaseProduct> products = new ArrayList<>();

    public void addProduct(BaseProduct product) {
        products.add(product);
    }

    public void displayProducts() {
        for (BaseProduct product : products) {
            product.displayInfo();
        }
    }
}
