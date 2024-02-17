package com.example.eventManagementSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;
@Entity
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Please add title")
    private String title;
    private String description;
    private Date date;
    private String location;
    private Integer capacity;
    @ManyToOne
    private User user;


    public Event() {
    }

    public Event(Long id, String title, String description, Date date, String location, Integer capacity , User user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.location = location;
        this.capacity = capacity;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
