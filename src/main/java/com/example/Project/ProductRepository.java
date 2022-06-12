package com.example.Project;

import com.example.Project.Models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findProductByColor(String color);
    List<Product> findProductByName(String name);
    List<Product> findProductByRate(Double rate);
    List<Product> findProductByCategory(String category);
}
