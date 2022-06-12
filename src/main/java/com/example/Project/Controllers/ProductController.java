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
    @GetMapping("/color/{color}")
    public List<Product> getColorProduct(@PathVariable String color) {
        return productService.getProductByColor(color);
    }
    @GetMapping("/name/{name}")
    public List<Product> getNameProduct(@PathVariable String name) {
        return productService.getProductByName(name);
    }
    @GetMapping("/rate/{rate}")
    public List<Product> getRateProduct(@PathVariable Double rate) {
        return productService.getProductByRate(rate);
    }
}
