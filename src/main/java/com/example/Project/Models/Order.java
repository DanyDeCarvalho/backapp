package com.example.Project.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
@Document(collection = "Order")
public class Order {
    @Id
    private String id;
    @Field
    private Integer orderNumber;
    @Field
    private String status;
    @Field
    private Date orderDate;
    @Field
    private User user;
    @Field
    private Double total;
    @Field
    private Cart cart;
    @Field
    private DeliveryAddress deliveryAddress;

    public Order() {}


    public Order(Integer orderNumber, String status, Double total) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.total = total;
    }
}
