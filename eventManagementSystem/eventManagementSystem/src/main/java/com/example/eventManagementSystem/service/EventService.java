package com.example.eventManagementSystem.service;

import com.example.eventManagementSystem.model.Event;

import java.util.List;

public interface EventService {
    Event saveEvent(Event event);

    List<Event> fetchEvent();

    Event fetchEventById(Long id);


    public void deleteEventById(Long id);


    Event updateEvent(Long id, Event event);

    Event fetchEventByTitle(String title);
}
