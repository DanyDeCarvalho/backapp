package com.example.Project.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Cart")
public class Cart {
    @Id
    private String id;
    @Field
    private String productReference;
    @Field
    private String userSession;
    @Field
    private Boolean validation;
    @Field
    private String paymentMethod;
    @Field
    private Integer quantity;
    @Field
    private Float total;
    public Cart() {}

}
