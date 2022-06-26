package com.example.Project.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
    @Field
    private String userId;
    @Field
    private Long total;
    @Field
    private ArrayList cart;
    @Field
    private Set<DeliveryAddress> deliveryAddress;

    public Order() {}

    public Order(String id, Integer orderNumber, String status, LocalDateTime orderDate, String userId, Long total, ArrayList cart, Set<DeliveryAddress> deliveryAddress) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.status = status;
        this.orderDate = orderDate;
        this.userId = userId;
        this.total = total;
        this.cart = cart;
        this.deliveryAddress = deliveryAddress;
    }

    public Order(Integer orderNumber, String status, LocalDateTime orderDate, String userId, Long total, ArrayList cart, Set<DeliveryAddress> deliveryAddress) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.orderDate = orderDate;
        this.userId = userId;
        this.total = total;
        this.cart = cart;
        this.deliveryAddress = deliveryAddress;
    }

    public Order(Integer orderNumber, String status, Long total) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.total = total;
    }

    public Order(Integer orderNumber, LocalDateTime orderDate, String userId) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.userId = userId;
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


    public String getUser() {
        return userId;
    }

    public void setUser(String userId) {
        this.userId = userId;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ArrayList getCart() {
        return cart;
    }

    public void setCart(ArrayList cart) {
        this.cart = cart;
    }

    public Set<DeliveryAddress> getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Set<DeliveryAddress> deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
