package com.example.Project.Session;

import org.springframework.security.crypto.bcrypt.BCrypt;

import java.util.ArrayList;

public class UserPassword {

    public static ArrayList<String> passwordHash(String password)
    {
        ArrayList<String> hashSalt = new ArrayList<String>();
        String salt = BCrypt.gensalt(4);
        String passwordHash = BCrypt.hashpw(password, salt);
        hashSalt.add(passwordHash);
        hashSalt.add(salt);
        return(hashSalt);
    }

    public static boolean checkPassword(String password , String salt)
    {
        boolean bool;
        if(BCrypt.checkpw(password, salt))
            bool  = true;
        else
            bool = false;
        return bool;
    }
}
