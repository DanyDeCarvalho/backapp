package com.example.Project.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Product")
public class Product {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String description;
    @Field
    private String images;
    @Field
    private Categories category;
    @Field
    private String color;
    @Field
    private Double price;
    @Field
    private Double average;
    @Field
    private Integer nbVote;
    @Field
    private Integer stock;

    public Product(){}

    public Product(String name, String description, String images, Categories category, String color, Double price, Integer stock) {
        this.name = name;
        this.description = description;
        this.images = images;
        this.category = category;
        this.color = color;
        this.price = price;
        this.stock = stock;
    }
    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }
}


