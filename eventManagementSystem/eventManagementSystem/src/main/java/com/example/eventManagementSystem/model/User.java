//package com.example.eventManagementSystem.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Entity(name = "user_tbl")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//
//    private String username;
//    private String password;
//    private String email;
//    @Enumerated(EnumType.STRING)
//    private Role role;
//
//    public User() {
//    }
//
//    public User(String username, String password, String email, Role role) {
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.role = role;
//    }
//
//
////    @Override
////    public String toString() {
////        return "User{" +
////                "id=" + id +
////                ", username='" + username + '\'' +
////                ", password='" + password + '\'' +
////                ", email='" + email + '\'' +
////                ", role='" + role + '\'' +
////                '}';
////    }
//}
//
