package com.example.Project.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "DeliveryAddress")
public class DeliveryAddress {
    @Id
    private String id;
    @Field
    private String country;
    @Field
    private String street;
    @Field
    private Integer zipCode;
    @Field
    private String city;
    @Field
    private String userId;

    public DeliveryAddress() {}

    public DeliveryAddress(String country, String street, Integer zipCode, String city, String userId) {
        this.country = country;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.userId = userId;
    }

    public DeliveryAddress(String country, String street, Integer zipCode, String userId) {
        this.country = country;
        this.street = street;
        this.zipCode = zipCode;
        this.userId = userId;
    }

    public DeliveryAddress(String country, String street, Integer zipCode) {
        this.country = country;
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
