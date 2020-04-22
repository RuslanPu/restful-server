package com.javamentor.server.rest;

import com.javamentor.server.model.Role;
import com.javamentor.server.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    void add(User user, String[] checkboxRoles);

    void edit(User user, String[] checkboxRoles);

    void delete(User user);

    User getUserById(Long id);

    User getUserByEmail(String email);

    void addRole(Role role);

    boolean unicEmail(String email);

    List<Role> getAllRole();
}
