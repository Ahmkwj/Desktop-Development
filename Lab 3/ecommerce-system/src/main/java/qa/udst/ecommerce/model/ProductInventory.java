/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 14-09-2025-08h-55m
*/

package qa.udst.ecommerce.model;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class ProductInventory {
    private HashMap<String, BaseProduct> products = new HashMap<>();
    private HashMap<String, ProductCategory> productCategories = new HashMap<>();

    public void addProduct(String id, BaseProduct product) {
        products.put(id, product);
    }

    public void addProduct(String id, BaseProduct product, ProductCategory category) {
        products.put(id, product);
        productCategories.put(id, category);
        product.setCategory(category);
    }

    public BaseProduct getProduct(String id) {
        if (!products.containsKey(id)) {
            throw new ProductNotFoundException("Product with ID " + id + " not found.");
        }
        return products.get(id);
    }

    public List<BaseProduct> getProductsByCategory(ProductCategory category) {
        List<BaseProduct> result = new ArrayList<>();
        for (String id : products.keySet()) {
            ProductCategory cat = productCategories.get(id);
            if (cat == category) {
                result.add(products.get(id));
            }
        }
        return result;
    }

    public void displayProductsByCategory(ProductCategory category) {
        List<BaseProduct> list = getProductsByCategory(category);
        for (BaseProduct product : list) {
            product.displayDetails();
        }
    }
}
