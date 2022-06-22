package com.example.Project;

import com.example.Project.Models.Categories;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CategoriesRepository extends MongoRepository<Categories, String> {

}