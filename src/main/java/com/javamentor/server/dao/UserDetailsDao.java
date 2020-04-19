package com.javamentor.server.dao;

import com.javamentor.server.model.User;


public interface UserDetailsDao {

    User getUserByName(String username);

}
