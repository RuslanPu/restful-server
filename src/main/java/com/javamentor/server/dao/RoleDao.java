package com.javamentor.server.dao;

import com.javamentor.server.model.Role;

import java.util.List;


public interface RoleDao {
    void add(Role role);

    Role getRoleById(Long id);

    Role getRoleByName(String name);

    List<Role> getAllRole();

}
