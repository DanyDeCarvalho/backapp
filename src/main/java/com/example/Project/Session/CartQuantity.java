package com.example.Project.Session;

import org.springframework.security.crypto.bcrypt.BCrypt;

import java.util.ArrayList;

public class CartQuantity {

    public static Integer IncreaseQuantity(Integer quantity)
    {
        if(quantity == null) {
            quantity = 0;
        }
        Integer increase = quantity + 1;

        return increase;
    }
}
