package com.example.Project;

import com.example.Project.Models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public ResponseEntity<?> getProductbyId(String id) {
        Optional<Product> product1 =  productRepository.findById(id);
        if(product1.isPresent()) {
            return ResponseEntity.ok(product1);
        }
        return ResponseEntity.badRequest().body("");
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

    public Product isFav(Product product) {
        Product product1 = productRepository.findById(product.getId()).get();
        product1.setFav(product.getFav());
        return productRepository.save(product1);
    };

    public List<Product> allFav(Integer fav) {
       return productRepository.findAllByFav(fav);
    };
    public List<Product> getProductByNameAsc() {
        return productRepository.findAllByOrderByNameAsc();
    };
    public List<Product> getProductByPriceAsc() {
        return productRepository.findAllByOrderByPriceAsc();
    };
    public List<Product> getProductByPriceDesc() {
        return productRepository.findAllByOrderByPriceDesc();
    };
    public List<Product> getProductByRateDesc() {
        return productRepository.findAllByOrderByRateDesc();
    };
    public List<Product> getProductByHighRate() {
        return productRepository.findTop4ByOrderByRateDesc();
    }
    public List<Product> getProductByCategoryAndPriceAndRate(Product product) {
        return productRepository.findProductByCategoryAndPriceAndRate(product.getCategory(), product.getPrice(), product.getRate());
    };
    public ResponseEntity<List<Product>>  getProductByFilter(Product filter) {
        List<Product> productList = productRepository.findAll();

        if (filter.getCategory() != null) {
            productList = productList.stream().filter(product -> Objects.equals(product.getCategory(), filter.getCategory())).collect(Collectors.<Product>toList());
        }
        if (filter.getColor() != null) {
            productList = productList.stream().filter(product -> Objects.equals(product.getColor(), filter.getColor())).collect(Collectors.<Product>toList());
        }
        if (filter.getPrice() != null && filter.getPrice() != null) {
            productList = productList.stream().filter(product -> product.getPrice() > filter.getPrice() && product.getPrice() < filter.getPrice()).collect(Collectors.<Product>toList());
        }
        if (filter.getRate() != null) {
            productList = productList.stream().filter(product -> Objects.equals(product.getRate(), filter.getRate())).collect(Collectors.<Product>toList());
        }
        if (filter.getStock() != null) {
            productList = productList.stream().filter(product -> Objects.equals(product.getStock(), filter.getStock())).collect(Collectors.<Product>toList());
        }
        return ResponseEntity.ok(productList);
    };

    public Product updateProduct(Product product) {
        Product thisProduct = productRepository.findById(product.getId()).get();
        thisProduct.setName(product.getName());
        thisProduct.setDescription(product.getDescription());
        thisProduct.setCategory(product.getCategory());
        thisProduct.setStock(product.getStock());
        thisProduct.setPrice(product.getPrice());
        thisProduct.setColor(product.getColor());
        thisProduct.setImage1(product.getImage1());
        thisProduct.setImage2(product.getImage2());
        thisProduct.setImage3(product.getImage3());
        thisProduct.setImage4(product.getImage4());
        return productRepository.save(thisProduct);
    }
}