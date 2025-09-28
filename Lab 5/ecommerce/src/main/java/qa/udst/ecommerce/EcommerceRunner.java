/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 28-09-2025-08h-24m
*/

package qa.udst.ecommerce;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;

import qa.udst.ecommerce.model.Product;
import qa.udst.ecommerce.model.ProductCategory;
import qa.udst.ecommerce.service.ProductService;

public class EcommerceRunner implements CommandLineRunner {

    public final ProductService ProductService;

    public EcommerceRunner(ProductService ProductService) {
        this.ProductService = ProductService;

    }

    @Override
    public void run(String... args) {
        Product product1 = new Product(1L, "iPhone 15 Pro", 1199.99, ProductCategory.DIGITAL);

        System.out.println(product1);
    }

    public static void main(String[] args) {
        Map<Long, Product> productStore = new HashMap<>();
        ProductService productService = new ProductService(productStore);

        EcommerceRunner runner = new EcommerceRunner(productService);
        runner.run(args);
    }

}
