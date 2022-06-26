package com.example.Project.Controllers;

import com.example.Project.Models.Product;
import com.example.Project.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://frd-co.vercel.app", allowCredentials = "true")
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
    } //recuperer un produit en fonction de son id
    @PostMapping("/color")
    public List<Product> getColorProduct(@RequestBody Product product) {
        return productService.getProductByColor(product);
    }//recuperer un produit en fonction de sa couleur
    @PostMapping("/name")
    public List<Product> getNameProduct(@RequestBody Product product) {
        return productService.getProductByName(product);
    } //recuperer un produit en fonction de son nom
    @PostMapping("/rate")
    public List<Product> getRateProduct(@RequestBody Product product) {
        return productService.getProductByRate(product);
    } //recuperer un produit en fonction de sa note
    @PostMapping("/category")
    public List<Product> getCategoryProduct(@RequestBody Product product) {
        return productService.getProductByCategory(product);
    } //recuperer un produit en fonction de sa category
    @PostMapping("/isFav")
    public Product isFav(@RequestBody Product product) {
        return productService.isFav(product);
    } //mettre en favorie le produit
    @GetMapping("/isFav/{fav}")
    public List<Product> isFav(@PathVariable Integer fav) {
        return productService.allFav(fav);
    } //recuperer un produit en fonction de si il est fav ou non

    @GetMapping("/nameAsc")
    public List<Product> getNameAscProduct() {
        return productService.getProductByNameAsc();
    } // triage par order alphabetique
    @GetMapping("/priceAsc")
    public List<Product> getPriceAscProduct() {
        return productService.getProductByPriceAsc();
    } // triage par prix croissant
    @GetMapping("/priceDesc")
    public List<Product> getPriceDescProduct() {
        return productService.getProductByPriceDesc();
    } // triage par prix decroissant
    @GetMapping("/rateDesc")
    public List<Product> getRateDescProduct() {
        return productService.getProductByRateDesc();
    } // triage par note la plus haute
    @GetMapping("/top4")
    public List<Product> getMostRatedProduct() {
        return productService.getProductByHighRate();
    }  // 4 produits les mieux notés
    @PostMapping("/categoryAndPriceAndRate")
    public List<Product> getProductFilteredProductByCategoryAndPriceAndRate(@RequestBody Product product) {
        return productService.getProductByCategoryAndPriceAndRate(product);
    }
    @PostMapping("/categoryAndPriceAndName")
    public ResponseEntity<List<Product>>  getProductByFilter(@RequestBody Product product) {
        return productService.getProductByFilter(product);
    }

}
