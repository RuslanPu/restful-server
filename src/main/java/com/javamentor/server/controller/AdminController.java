package com.javamentor.server.controller;
import com.javamentor.server.model.JsonObject;
import com.javamentor.server.model.User;
import com.javamentor.server.rest.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService rest;

    @GetMapping("/getUserList")
    public JsonObject getUserList() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.setListUsers(rest.getAllUser());
        return jsonObject;
    }

    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable Long id) {
        User user = rest.getUserById(id);
        return user;
    }

    @GetMapping("/getAllRole")
    public JsonObject getAllRole() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.setAllRoles(rest.getAllRole());
        return jsonObject;
    }

    @PostMapping("/editUser")
    public String editUser(@RequestBody JsonObject jsonObject){
        rest.edit(jsonObject.getCurrentUserForEdit(), jsonObject.getCurrentSelectedRolesForEdit());
        return "update";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody JsonObject jsonObject){
        rest.add(jsonObject.getCurrentUserForEdit(), jsonObject.getCurrentSelectedRolesForEdit());
        return "add";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUserById(@PathVariable Long id) {
        User userForDeleted = rest.getUserById(id);
        rest.delete(userForDeleted);
        return "delete";
    }

}