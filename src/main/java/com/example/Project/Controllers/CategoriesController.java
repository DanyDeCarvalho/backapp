package com.example.Project.Controllers;

import com.example.Project.CategoriesService;
import com.example.Project.Models.Categories;
import com.example.Project.Models.Order;
import com.example.Project.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "localhost:3000", allowCredentials = "true")
@RestController
@RequestMapping("/categories")
public class CategoriesController {

    private CategoriesService categoriesService;

    public CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping
    public List<Categories> fetchAllCategories() {
        return categoriesService.getAllCategories();
    }
    @PostMapping("/save")
    public Categories addCategory(@RequestBody Categories category) {
        Categories category1 = categoriesService.saveCategory(category);
        return category1;
    }
}
