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

    public Cart(String id, String productReference, String userSession, Boolean validation, String paymentMethod, Integer quantity, Float total) {
        this.id = id;
        this.productReference = productReference;
        this.userSession = userSession;
        this.validation = validation;
        this.paymentMethod = paymentMethod;
        this.quantity = quantity;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductReference() {
        return productReference;
    }

    public void setProductReference(String productReference) {
        this.productReference = productReference;
    }

    public String getUserSession() {
        return userSession;
    }

    public void setUserSession(String userSession) {
        this.userSession = userSession;
    }

    public Boolean getValidation() {
        return validation;
    }

    public void setValidation(Boolean validation) {
        this.validation = validation;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
}
