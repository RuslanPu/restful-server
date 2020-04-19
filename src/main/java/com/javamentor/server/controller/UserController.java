package com.javamentor.server.controller;

import com.javamentor.server.model.Role;
import com.javamentor.server.model.User;
import com.javamentor.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/getUser/{email}")
    public User getUserById(@PathVariable("email") String email) {
        User user = service.getUserByEmail(email);
        return user;
    }

    @GetMapping("/test")
    public String getAjax() {
        return "user/testAjax";
    }
}
