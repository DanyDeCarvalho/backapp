package com.example.Project;

import com.example.Project.Models.Order;
import com.example.Project.Models.Product;
import com.example.Project.Models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private Object Product;
    private Object List;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Optional<Product> getProductbyId(String id) {

        return productRepository.findById(id);
    }
    public void deleteProductbyId(String id) {
        productRepository.deleteById(id);
    }
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    public List<Product> getProductByColor(Product product) {
        return productRepository.findProductByColor(product.getColor());
    };
    public List<Product> getProductByName(Product product) {
        return productRepository.findProductByName(product.getName());
    };
    public List<Product> getProductByRate(Product product) {
        return productRepository.findProductByRate(product.getRate());
    };
    public List<Product> getProductByCategory(Product product) {
        return productRepository.findProductByCategory(product.getCategory());
    };
    public List<Product> getProductByFilter(Product product) {
        return productRepository.findProductByCategoryOrPriceOrRate(product.getCategory(), product.getPrice(), product.getRate());
    };
}