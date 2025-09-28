/*
 • Name: Ahmed Khawaja  
 • Student ID: 60104808  
 • Created On 28-09-2025-08h-24m
*/

package qa.udst.ecommerce.model;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Product {
    @NotNull(message = "Product ID cannot be null")
    private Long id;

    @NotNull(message = "Product name cannot be null")
    @Size(min = 3, max = 100, message = "Product name must be between 3 and 100 characters")
    private String name;

    @DecimalMin(value = "0.01", message = "Product price must be greater than 0")
    private double price;

    @NotNull(message = "Product category cannot be null")
    private ProductCategory category;

    // Default constructor for Jackson
    public Product() {
    }

    public Product(Long id, String name, double price, ProductCategory category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", getId()="
                + getId() + ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getCategory()="
                + getCategory() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

}
