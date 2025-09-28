/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 28-09-2025-08h-25m
*/

package qa.udst.ecommerce.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import qa.udst.ecommerce.model.Product;

@Service
public class ProductService {
    private Map<Long, Product> store = new HashMap<Long, Product>();

    public ProductService(Map<Long, Product> store) {
        this.store = store;
    }

    public Collection<Product> findAll() {
        return store.values();
    }

    public Product findById(Long id) {
        return store.get(id);
    }

    public Product add(Product product) {
        store.put(product.getId(), product);
        return product;
    }

    public Product update(Long id, Product product) {
        store.put(id, product);
        return product;
    }

    public Product delete(long id) {
        Product product = store.remove(id);
        return product;
    }
}