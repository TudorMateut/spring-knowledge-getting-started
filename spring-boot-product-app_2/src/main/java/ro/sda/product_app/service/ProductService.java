package ro.sda.product_app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ro.sda.product_app.dto.Product;
import ro.sda.product_app.exception.custom_exceptions.AlreadyExistentException;
import ro.sda.product_app.exception.custom_exceptions.NotFoundException;
import ro.sda.product_app.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) {
        Optional<Product> optionalProduct = productRepository.findByName(product.getName());
        if (optionalProduct.isPresent()) {
            throw new AlreadyExistentException();
        }
        productRepository.save(product);
    }

    public List<Product> findProductsWithPriceGreaterThan(int price) {
        return productRepository.findAllByPriceGreaterThan(price);
    }

//    public void method(Product product) {
//        Product product1 = productRepository.findByName(product.getName()).orElseThrow(() -> new RuntimeException());
//    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

//    public Product findById(int id) {
//        Optional<Product> opt = productRepository.findById(id);
//        if (opt.isPresent()) {
//            return opt.get();
//        } else {
//            throw new NotFoundException();
//        }
//    }

    public Product findById(int id) {
        return productRepository.findById(id).orElseThrow(() -> new NotFoundException());
    }
}


