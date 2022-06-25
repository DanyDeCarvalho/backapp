package com.example.Project.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Set;

@Document(collection = "Cart")
public class Cart {
    @Id
    private String id;
    @Field
    private Set<Product> product;
    @Field
    private String userSession;
    @Field
    private Boolean validation;
    @Field
    private String productId;
    @Field
    private String paymentMethod;
    @Field
    private Integer quantity;
    @Field
    private Long total;
    public Cart() {}

    public Cart(String id, Set<Product> product, String userSession, Boolean validation, String productId, String paymentMethod, Integer quantity, Long total) {
        this.id = id;
        this.product = product;
        this.userSession = userSession;
        this.validation = validation;
        this.productId = productId;
        this.paymentMethod = paymentMethod;
        this.quantity = quantity;
        this.total = total;
    }

    public Cart(Set<Product> product, String userSession, Boolean validation, String productId, String paymentMethod, Integer quantity, Long total) {
        this.product = product;
        this.userSession = userSession;
        this.validation = validation;
        this.productId = productId;
        this.paymentMethod = paymentMethod;
        this.quantity = quantity;
        this.total = total;
    }

    public Cart(String id, Set<Product> product, String userSession, Boolean validation, String paymentMethod, Integer quantity, Long total) {
        this.id = id;
        this.product = product;
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

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
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

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
