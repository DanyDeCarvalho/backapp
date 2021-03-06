package com.example.Project.Controllers;

import com.example.Project.CategoriesService;
import com.example.Project.Models.Categories;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://frd-co.vercel.app", allowCredentials = "true")
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
