package com.example.Project.Controllers;
import com.example.Project.Models.User;
import com.example.Project.UserService;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private Page<Object> ObjectMapperUtils;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> fetchAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable ObjectId id) {
        return userService.getUserId(id);
    }

    @PostMapping("/signUp")
    public User addUser(@RequestBody User user) {
        return userService.signUp(user);
    }
    @PostMapping("/signIn")
    public ResponseEntity<Object> signIn(@RequestBody User user) {
        return userService.signIn(user);
    }
    @PutMapping("/save")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

}
