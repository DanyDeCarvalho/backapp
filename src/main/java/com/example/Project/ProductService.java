package com.example.Project;

import com.example.Project.Models.Order;
import com.example.Project.Models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

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
    public List<Product> getProductByColor(String color) {
        return productRepository.findProductByColor(color);
    };
    public List<Product> getProductByName(String name) {
        return productRepository.findProductByName(name);
    };
    public List<Product> getProductByRate(Double rate) {
        return productRepository.findProductByRate(rate);
    };
    public List<Product> getProductByCategory(String rate) {
        return productRepository.findProductByCategory(rate);
    };
}