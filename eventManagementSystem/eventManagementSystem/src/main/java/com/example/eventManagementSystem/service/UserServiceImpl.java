package com.example.eventManagementSystem.service;

import com.example.eventManagementSystem.model.User;
import com.example.eventManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> fetchUser() {
        return userRepository.findAll();
    }

    @Override
    public User fetchUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUserById(Long id, User user) {
        Optional<User> existingUserOptional = userRepository.findById(id);
        if(existingUserOptional.isPresent()) {
            User existingUser = existingUserOptional.get();
            if (user.getUsername() != null) {
                existingUser.setUsername(user.getUsername());
            }
            if (user.getPassword() != null) {
                existingUser.setPassword(user.getPassword());
            }
            if (user.getEmail() != null) {
                existingUser.setEmail(user.getEmail());
            }
            if (user.getRole() != null) {
                existingUser.setRole(user.getRole());
            }
            return userRepository.save(existingUser);
        } else {
            throw new RuntimeException("Registration not found with id" +id);
        }
    }
}
