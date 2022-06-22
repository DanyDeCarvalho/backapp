package com.example.Project.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Set;

@Document(collection = "Order")
public class Order {
    @Id
    private String id;
    @Field
    private Integer orderNumber;
    @Field
    private String status;
    @Field
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime orderDate;
    @DBRef
    private Set<User> user;
    @Field
    private Double total;
    @Field
    private Cart cart;
    @Field
    private Set<DeliveryAddress> deliveryAddress;

    public Order() {}

    public Order(String id, Integer orderNumber, String status, LocalDateTime orderDate, Set<User> user, Double total, Cart cart, Set<DeliveryAddress> deliveryAddress) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.status = status;
        this.orderDate = orderDate;
        this.user = user;
        this.total = total;
        this.cart = cart;
        this.deliveryAddress = deliveryAddress;
    }

    public Order(Integer orderNumber, String status, LocalDateTime orderDate, Set<User> user, Double total, Cart cart, Set<DeliveryAddress> deliveryAddress) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.orderDate = orderDate;
        this.user = user;
        this.total = total;
        this.cart = cart;
        this.deliveryAddress = deliveryAddress;
    }

    public Order(Integer orderNumber, String status, Double total) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.total = total;
    }

    public Order(Integer orderNumber, LocalDateTime orderDate, Set<User> user) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }


    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Set<DeliveryAddress> getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Set<DeliveryAddress> deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
