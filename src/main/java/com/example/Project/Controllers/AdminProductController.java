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
@RequestMapping("/admin/products")
public class AdminProductController {
    private final ProductService productService;

    public AdminProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    public Product addProduct(@RequestBody Product product) {
        Product product1 = productService.saveProduct(product);
        return product1;
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProductbyId(id);
    }

}
