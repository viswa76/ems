//package com.example.eventManagementSystem.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.Data;
//
//@Entity
//@Data
//public class Registration {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private User user;
//    private Event event;
//    private String ticketId;
//
//    public Registration() {
//    }
//
//    public Registration(Long id, User user, Event event, String ticketId) {
//        this.id = id;
//        this.user = user;
//        this.event = event;
//        this.ticketId = ticketId;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Registration{" +
//                "id=" + id +
//                ", userId=" + user +
//                ", eventId=" + event +
//                ", ticketId='" + ticketId + '\'' +
//                '}';
//    }
//}
