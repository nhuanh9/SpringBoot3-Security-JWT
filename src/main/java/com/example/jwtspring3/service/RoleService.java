package com.example.jwtspring3.service;


import com.example.jwtspring3.model.Role;

public interface RoleService {
    Iterable<Role> findAll();

    void save(Role role);

    Role findByName(String name);
}
