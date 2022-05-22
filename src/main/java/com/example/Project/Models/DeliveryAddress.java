package com.example.Project.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "DeliveryAddress")
public class DeliveryAddress {
    @Id
    private String id;
    @Field
    private String nameCustomer;
    @Field
    private String country;
    @Field
    private String street;
    @Field
    private Integer postalCode;
    @Field
    private Integer number;

    public DeliveryAddress() {}

}
