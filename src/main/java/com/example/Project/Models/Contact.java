package com.example.Project.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Contact")
public class Contact {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String email;
    @Field
    private String subject;
    @Field
    private String desciption;

    public Contact() {}

    public Contact(String name, String email, String subject, String desciption) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.desciption = desciption;
    }

    public Contact(String id, String name, String email, String subject, String desciption) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.desciption = desciption;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
}
