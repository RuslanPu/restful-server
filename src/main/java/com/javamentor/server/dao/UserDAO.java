package com.javamentor.server.dao;


import com.javamentor.server.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUser();

    void add(User user);

    void edit(User user);

    void delete(User user);

    User getUserById(Long id);

    User getUserByEmail(String email);

    boolean unicEmail(String email);
}
