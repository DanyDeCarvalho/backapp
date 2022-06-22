package com.example.Project.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Address")
public class Address {
    @Id
    private String id;
    @Field
    private String street;
    @Field
    private Integer postalCode;
    @Field
    private Integer number;

    public Address() {}

    public Address(String country, String street, Integer postalCode, Integer number) {
        this.country = country;
        this.street = street;
        this.postalCode = postalCode;
        this.number = number;
    }
}
