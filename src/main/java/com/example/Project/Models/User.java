package com.example.Project.Models;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.HashSet;

import java.util.Set;

@Document(collection = "User")
public class User {
    @Id
    private String id;
    @Field
    private String userName;
    @Field
    private String name;
    @Field
    private String lastName;
    @Field
    private Integer age;
    @Field
    private String email;
    @Field
    private String street;
    @Field
    private String zipCode;
    @Field
    private String city;
    @Field
    private String civility;
    @Field
    private Boolean admin;
    @Field
    private Set<BankCard> bankCard;
    @Field
    private String passwordSalt;
    @Field
    private String password;
    @Field
    private String PasswordHash;
    @Field
    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User(String id, String userName, String name, String lastName, Integer age, String email, String street, String zipCode, String city, String civility, Boolean admin, Set<BankCard> bankCard, String passwordSalt, String password, String passwordHash, Set<Role> roles) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.civility = civility;
        this.admin = admin;
        this.bankCard = bankCard;
        this.passwordSalt = passwordSalt;
        this.password = password;
        PasswordHash = passwordHash;
        this.roles = roles;
    }

    public User(String userName, String name, String lastName, Integer age, String email, String street, String zipCode, String city, String civility, Boolean admin, Set<BankCard> bankCard, String passwordSalt, String password, String passwordHash, Set<Role> roles) {
        this.userName = userName;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.civility = civility;
        this.admin = admin;
        this.bankCard = bankCard;
        this.passwordSalt = passwordSalt;
        this.password = password;
        PasswordHash = passwordHash;
        this.roles = roles;
    }
    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public User(String email, String password, Boolean admin) {
        this.email = email;
        this.password = password;
        this.admin = admin;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
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

    public Set<BankCard> getBankCard() {
        return bankCard;
    }

    public void setBankCard(Set<BankCard> bankCard) {
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUsername() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
