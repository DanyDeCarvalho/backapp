package com.example.Project.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Categories")
public class Categories {
    @Id
    private Long id;
    @Field
    private String name;
    @Field
    private String description;
    public Categories() {}

}
