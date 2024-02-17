package com.example.eventManagementSystem.controller;

import com.example.eventManagementSystem.model.User;
import com.example.eventManagementSystem.service.UserService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    @PostMapping("/users")
    public User saveUser(@Valid @RequestBody User user){
        logger.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }
    @GetMapping("/users")
    public List<User> fetchUser(){
        logger.info("Inside fetchUser of UserController");
        return userService.fetchUser();
    }
    @GetMapping("/users/{id}")
    public User fetchUserById(@PathVariable("id") Long id){
        return userService.fetchUserById(id);
    }
    @DeleteMapping("/users/{id}")
    public String deleteUserById(@PathVariable("id") Long id){
        userService.deleteUserById(id);
        return "Deleted Successfully";
    }
    @PutMapping("/users/{id}")
    public User updateUserById(@PathVariable("id") Long id, @RequestBody User user){
        return userService.updateUserById(id,user);
    }


}
