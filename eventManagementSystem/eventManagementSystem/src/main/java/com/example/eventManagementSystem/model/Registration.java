package com.example.eventManagementSystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Event event;
    private String ticketId;

    public Registration() {
    }

    public Registration(Long id, User user, Event event, String ticketId) {
        this.id = id;
        this.user = user;
        this.event = event;
        this.ticketId = ticketId;
    }


    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", userId=" + user +
                ", eventId=" + event +
                ", ticketId='" + ticketId + '\'' +
                '}';
    }
}
