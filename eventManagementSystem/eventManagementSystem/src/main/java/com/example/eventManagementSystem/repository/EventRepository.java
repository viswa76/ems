package com.example.eventManagementSystem.repository;

import com.example.eventManagementSystem.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    public Event findByTitle(String title);
    public Event findByTitleIgnoreCase(String title);
}
