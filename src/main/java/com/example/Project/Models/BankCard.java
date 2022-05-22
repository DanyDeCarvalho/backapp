package com.example.Project.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "BackCard")
public class BankCard {
    @Id
    private String id;
    @Field
    private String number;
    @Field
    private String name;
    @Field
    private Date validityDate;
    @Field
    private String cryptogram;
    public BankCard() {}

}
