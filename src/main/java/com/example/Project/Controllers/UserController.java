package com.example.Project.Controllers;
import com.example.Project.Models.User;
import com.example.Project.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://frd-co.vercel.app", allowCredentials = "true")
 @RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> fetchAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable String id) {
        return userService.getUserId(id);
    } // recuperer un user en fonction de son id

    @PutMapping("/save")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    } // mettre un jour les informations d'un user

}
