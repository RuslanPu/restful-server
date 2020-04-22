package com.javamentor.server.controller;
import com.javamentor.server.model.User;
import com.javamentor.server.rest.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService rest;

    @GetMapping("/getUser/{email}")
    public User getUserByEmail(@PathVariable("email") String email) {
        User user = rest.getUserByEmail(email);
        return user;
    }

}
