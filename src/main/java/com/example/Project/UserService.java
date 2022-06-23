package com.example.Project;

import com.example.Project.Models.User;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.Project.Session.UserPassword;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {

        return userRepository.findAll();
    }
    public Optional<User> getUserId(ObjectId id) {

        return userRepository.findById(id);
    }
    public void deleteUserbyId(ObjectId id) {
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
        thisUser.setEmail(user.getEmail());
        thisUser.setCity(user.getCity());
        thisUser.setStreet(user.getStreet());
        thisUser.setZipCode(user.getZipCode());
        thisUser.setAdmin(user.getAdmin());
        return userRepository.save(thisUser);

        }
}
