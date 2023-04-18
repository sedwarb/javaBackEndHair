package com.hairdressing.service;

import com.hairdressing.model.Users;

import java.util.ArrayList;
import java.util.Optional;

public interface UsersService {
    ArrayList<Users> getAllUsers();
    Optional<Users> getUserById(Long id);
    Users saveUser(Users user);
    boolean deleteUserById(Long id);
}
