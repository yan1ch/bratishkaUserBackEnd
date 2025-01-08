package com.example.bratishka.bratishkaUserBackEnd.services;

import com.example.bratishka.bratishkaUserBackEnd.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
    User findByUsername(String username);
}
