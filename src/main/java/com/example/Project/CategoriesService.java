package com.example.Project;

import com.example.Project.Models.Categories;

import com.example.Project.Models.Contact;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoriesService {
    private final CategoriesRepository categoriesRepository;

    public CategoriesService(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }

    public Categories saveCategory(Categories category) {
        return categoriesRepository.save(category);
    }


}