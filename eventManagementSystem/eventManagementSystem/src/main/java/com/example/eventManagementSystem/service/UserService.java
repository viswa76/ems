package com.example.eventManagementSystem.service;

import com.example.eventManagementSystem.model.User;

import java.util.List;

public interface UserService {




    User saveUser(User user);

    List<User> fetchUser();

    User fetchUserById(Long id);

    void deleteUserById(Long id);

    User updateUserById(Long id, User user);
}
