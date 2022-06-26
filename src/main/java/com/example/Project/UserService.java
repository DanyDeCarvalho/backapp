package com.example.Project;

import com.example.Project.Models.Address;
import com.example.Project.Models.DeliveryAddress;
import com.example.Project.Models.User;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.Project.Session.UserPassword;

import java.util.*;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {

        return userRepository.findAll();
    }
    public Optional<User> getUserId(String id) {

        return userRepository.findById(id);
    }

    public void deleteUserbyId(String id) {
         userRepository.deleteById(id);
    }

    public User signUp(User customer) {
        Optional<User> user = userRepository.findByEmail(customer.getEmail());
        ArrayList<String> hashSalt = UserPassword.passwordHash(customer.getPassword());
        customer.setPasswordSalt(hashSalt.get(1));
        customer.setPasswordHash(hashSalt.get(0));
        return userRepository.insert(customer);
    }
    public ResponseEntity<Object> signIn(User customer) {
        Optional<User> user = userRepository.findByEmail(customer.getEmail());

        if (user.isPresent()) {
            boolean check = UserPassword.checkPassword(customer.getPassword(), user.get().getPasswordSalt());
            if (true) {
                return ResponseEntity.ok(UUID.randomUUID());
            }
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.notFound().build();
    }

    public User updateUser(User user) {
        User thisUser = userRepository.findById(user.getId()).get();
        thisUser.setUserName(user.getUsername());
        thisUser.setName(user.getName());
        thisUser.setLastName(user.getLastName());
        thisUser.setAge(user.getAge());
        thisUser.setEmail(user.getEmail());
        thisUser.setCity(user.getCity());
        thisUser.setStreet(user.getStreet());
        thisUser.setZipCode(user.getZipCode());
        thisUser.setCivility(user.getCivility());
        thisUser.setBankCard(user.getBankCard());
        thisUser.setRoles(user.getRoles());
        return userRepository.save(thisUser);

        }
}
