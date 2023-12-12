package goodgirly.com.minilibrarymanagementsystem.controllers;

import goodgirly.com.minilibrarymanagementsystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UsersController {
    @Autowired
    private  UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }
}
