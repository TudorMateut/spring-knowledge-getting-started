package ro.sda.database_layer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.database_layer.config.ProjectConfig;
import ro.sda.database_layer.model.Product;
import ro.sda.database_layer.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductService productService = context.getBean(ProductService.class);
            productService.addProduct(new Product("product 18"));
            productService.addProduct(new Product("product 22"));
            productService.addProduct(new Product("product 13"));

            List<Product> results = productService.getAllProducts();
            System.out.println(results);

            try {
                productService.addProductExWithoutTx(List.of(new Product("meat"), new Product("bread"),
                        new Product("egg")));
            } catch (RuntimeException ex) {
                System.out.println(ex);
            }

            List<Product> results2 = productService.getAllProducts();
            System.out.println(results2);

            try {
                productService.addProductTransactional(List.of(new Product("milk"), new Product("yogurt"),
                        new Product("potato")));
            } catch (RuntimeException ex) {
                System.out.println(ex);
            }

            List<Product> results3 = productService.getAllProducts();
            System.out.println(results3);
        }
    }
}
