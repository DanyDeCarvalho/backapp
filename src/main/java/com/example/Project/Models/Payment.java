package com.example.Project.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Payment")
public class Payment {
    @Id
    private String id;
    @Field
    private String paymentMethod;
    @Field
    private Cart cart;
    @Field
    private Address deliveryAdress;

    public Payment() {}
}
