package com.example.Project.Controllers;
import com.example.Project.UserService;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "localhost:3000", allowCredentials = "true")
@RestController
@RequestMapping("/admin/users")
public class AdminUserController {

    private final UserService userService;
    private Page<Object> ObjectMapperUtils;

    public AdminUserController(UserService userService) {
        this.userService = userService;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUserbyId(id);
    }
}
