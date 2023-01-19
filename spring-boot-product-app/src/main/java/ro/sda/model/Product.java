package ro.sda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    private int id;
    private String name;
    private String description;
    private int price;
    private Boolean isInStock;

    public Product(String name, String description, int price, Boolean isInStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }
}
