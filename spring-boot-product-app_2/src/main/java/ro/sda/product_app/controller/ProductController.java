package ro.sda.product_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.sda.product_app.dto.Product;
import ro.sda.product_app.service.ProductService;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product/add")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping("/products/all")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/products")
    public List<Product> findPriceGreaterThan(@RequestParam int price) {
        return productService.findProductsWithPriceGreaterThan(price);
    }

    @GetMapping("/product/{id}")
    public Product findById(@PathVariable int id) {
        return productService.findById(id);
    }
}
