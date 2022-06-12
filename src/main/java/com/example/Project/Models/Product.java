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
    private String category;
    @Field
    private String color;
    @Field
    private Double price;
    @Field
    private Double rate;
    @Field
    private Integer nbVote;
    @Field
    private Integer stock;

    public Product(){}

    public Product(String name, String description, String images, String category, String color, Double price, Integer stock) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getNbVote() {
        return nbVote;
    }

    public void setNbVote(Integer nbVote) {
        this.nbVote = nbVote;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}


