package com.example.Project.Controllers;
import com.example.Project.Models.Product;
import com.example.Project.ProductService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://frd-co.vercel.app", allowCredentials = "true")
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
    @PutMapping("/save")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }
}
