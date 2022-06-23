package com.example.Project.Controllers;

import com.example.Project.Models.Order;
import com.example.Project.Models.Product;
import com.example.Project.Models.User;
import com.example.Project.ProductService;
import org.springframework.http.ResponseEntity;
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
    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable String id) {
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
    @GetMapping("/nameAsc")
    public List<Product> getNameAscProduct() {
        return productService.getProductByNameAsc();
    }
    @GetMapping("/priceAsc")
    public List<Product> getPriceAscProduct() {
        return productService.getProductByPriceAsc();
    }
    @GetMapping("/priceDesc")
    public List<Product> getPriceDescProduct() {
        return productService.getProductByPriceDesc();
    }
    @GetMapping("/rateDesc")
    public List<Product> getRateDescProduct() {
        return productService.getProductByRateDesc();
    }
    @GetMapping("/top4")
    public List<Product> getMostRatedProduct() {
        return productService.getProductByHighRate();
    }
    @PostMapping("/categoryAndPriceAndRate")
    public List<Product> getProductFilteredProductByCategoryAndPriceAndRate(@RequestBody Product product) {
        return productService.getProductByCategoryAndPriceAndRate(product);
    }
    @PostMapping("/categoryAndPriceAndName")
    public List<Product> getProductFilteredProductByCategoryAndPriceAndName(@RequestBody Product product) {
        return productService.getProductByCategoryAndPriceAndName(product);
    }

}
