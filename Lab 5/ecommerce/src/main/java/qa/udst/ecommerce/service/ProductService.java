/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 28-09-2025-08h-25m
*/

package qa.udst.ecommerce.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import qa.udst.ecommerce.model.Product;

public class ProductService {
    private Map<Long, Product> store;

    public ProductService() {
        this.store = new HashMap<>();
    }

    public ProductService(Map<Long, Product> store) {
        this.store = store;
    }

    public Collection<Product> findAll() {
        return store.values();
    }

    public Product findById(Long id) {
        Product product = store.get(id);
        if (product == null) {
            throw new ProductNotFoundException(id);
        }
        return product;
    }

    public Product add(Product product) {
        store.put(product.getId(), product);
        return product;
    }

    public Product update(Long id, Product product) {
        if (!store.containsKey(id)) {
            throw new ProductNotFoundException(id);
        }
        product.setId(id);
        store.put(id, product);
        return product;
    }

    public void delete(Long id) {
        if (!store.containsKey(id)) {
            throw new ProductNotFoundException(id);
        }
        store.remove(id);
    }

    public Map<Long, Product> getStore() {
        return store;
    }

    public void setStore(Map<Long, Product> store) {
        this.store = store;
    }
}
