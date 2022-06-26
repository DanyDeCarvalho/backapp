package com.example.Project;

import com.example.Project.Models.Categories;
import com.example.Project.Models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Set;

public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findProductByColor(String color);
    List<Product> findProductByName(String name);
    List<Product> findProductByRate(Double rate);
    List<Product> findAllByFav(Integer fav);
    List<Product> findProductByCategory(Set<Categories> category);
    List<Product> findProductByCategoryAndPriceAndRate(Set<Categories> category, Double price, Double rate);
    List<Product> findAllByOrderByNameAsc();
    List<Product> findAllByOrderByPriceAsc();
    List<Product> findAllByOrderByPriceDesc();
    List<Product> findAllByOrderByRateDesc();
    List<Product> findTop4ByOrderByRateDesc();
}
