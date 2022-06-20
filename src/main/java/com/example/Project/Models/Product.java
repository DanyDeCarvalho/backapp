package com.example.Project.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "Product")
public class Product {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String description;
    @Field
    private String image1;
    @Field
    private String image2;
    @Field
    private String image3;
    @Field
    private String image4;
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
    @Field
    private Date dateAdded;
    @Field
    private Integer quantityOnCart;

    public Product(){}

    public Product(String id, String name, String description, String image1, String image2, String image3, String image4, String category, String color, Double price, Double rate, Integer nbVote, Integer stock, Date dateAdded, Integer quantityOnCart) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
        this.category = category;
        this.color = color;
        this.price = price;
        this.rate = rate;
        this.nbVote = nbVote;
        this.stock = stock;
        this.dateAdded = dateAdded;
        this.quantityOnCart = quantityOnCart;
    }

    public Product(String name, String description, String image1, String image2, String image3, String image4, String category, String color, Double price, Double rate, Integer nbVote, Integer stock, Date dateAdded, Integer quantityOnCart) {
        this.name = name;
        this.description = description;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
        this.category = category;
        this.color = color;
        this.price = price;
        this.rate = rate;
        this.nbVote = nbVote;
        this.stock = stock;
        this.dateAdded = dateAdded;
        this.quantityOnCart = quantityOnCart;
    }

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Product(String category, Double price) {
        this.category = category;
        this.price = price;
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

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
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

    public Integer getQuantityOnCart() {
        return quantityOnCart;
    }

    public void setQuantityOnCart(Integer quantityOnCart) {
        this.quantityOnCart = quantityOnCart;
    }
}


