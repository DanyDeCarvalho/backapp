package com.example.Project.Controllers;

import com.example.Project.Models.Order;
import com.example.Project.Models.Product;
import com.example.Project.Models.User;
import com.example.Project.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product> fetchAllProducts() {
        return productService.getAllProducts();
    }
    @PostMapping("/save")
    public Product addProduct(@RequestBody Product product) {
        Product product1 = productService.saveProduct(product);
        return product1;
    }
    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable String id) {
        return productService.getProductbyId(id);
    }
    @PostMapping("/color")
    public List<Product> getColorProduct(@RequestBody Product product) {
        return productService.getProductByColor(product);
    }
    @PostMapping("/name")
    public List<Product> getNameProduct(@RequestBody Product product) {
        return productService.getProductByName(product);
    }
    @PostMapping("/rate")
    public List<Product> getRateProduct(@RequestBody Product product) {
        return productService.getProductByRate(product);
    }
    @PostMapping("/category")
    public List<Product> getCategoryProduct(@RequestBody Product product) {
        return productService.getProductByCategory(product);
    }
    @PostMapping("/filter")
    public List<Product> getProductFilteredProduct(@RequestBody Product product) {
        return productService.getProductByFilter(product);
    }
}
