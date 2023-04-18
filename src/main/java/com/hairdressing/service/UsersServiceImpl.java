package com.hairdressing.service;

import com.hairdressing.model.Users;
import com.hairdressing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UserRepository userRepository;

    @Override
    public ArrayList<Users> getAllUsers() {
        return (ArrayList<Users>) userRepository.findAll();
    }

    @Override
    public Optional<Users> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public boolean deleteUserById(Long id) {
        try {
            Optional<Users> user = getUserById(id);
            userRepository.delete(user.get());
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
