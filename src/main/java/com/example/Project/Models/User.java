package com.example.Project.Models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Document(collection = "User")
public class User {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String lastName;
    @Field
    private Integer age;
    @Field
    private String email;
    @Field
    private String civility;
    @Field
    private Boolean admin;
    @Field
    private BankCard bankCard;
    @Field
    private String passwordSalt;
    @Field
    private String password;
    @Field
    private String PasswordHash;
    public User() {
    }

    public User(String name, String lastName, Integer age, String email, String civility, Boolean admin, BankCard bankCard, String passwordSalt, String password, String passwordHash) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.civility = civility;
        this.admin = admin;
        this.bankCard = bankCard;
        this.passwordSalt = passwordSalt;
        this.password = password;
        PasswordHash = passwordHash;
    }

    public User(String id, String name, String lastName, Integer age, String email, String civility, Boolean admin, BankCard bankCard, String passwordSalt, String password, String passwordHash) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.civility = civility;
        this.admin = admin;
        this.bankCard = bankCard;
        this.passwordSalt = passwordSalt;
        this.password = password;
        PasswordHash = passwordHash;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCivility() {
        return civility;
    }

    public void setCivility(String civility) {
        this.civility = civility;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordHash() {
        return PasswordHash;
    }

    public void setPasswordHash(String passwordHash) {
        PasswordHash = passwordHash;
    }
}
