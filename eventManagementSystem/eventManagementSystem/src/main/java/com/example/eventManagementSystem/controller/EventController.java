package com.example.eventManagementSystem.controller;

import com.example.eventManagementSystem.model.Event;
import com.example.eventManagementSystem.service.EventService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin
public class EventController {
    @Autowired
    private EventService eventService;
    private final Logger logger = LoggerFactory.getLogger(EventController.class);
    @PostMapping("/events")
    public Event saveEvent(@Valid @RequestBody Event event){
        logger.info("Inside saveEvent of EventController");
        return eventService.saveEvent(event);

    }
    @GetMapping("/events")
    public List <Event> fetchEvent(){
        logger.info("Inside fetchEvent of EventController");
        return eventService.fetchEvent();
    }
    @GetMapping("/events/{id}")
    public Event fetchEventById(@PathVariable("id") Long id){

        return eventService.fetchEventById(id);
    }
    @DeleteMapping("/events/{id}")
    public String deleteEventById(@PathVariable("id") Long id){
        eventService.deleteEventById(id);
        return "Deleted Successfully";
    }
    @PutMapping("/events/{id}")
    public Event updateEvent(@PathVariable("id") Long id ,@RequestBody Event event){
        return eventService.updateEvent(id,event);
    }
    @GetMapping("/events/title/{title}")
    public Event fetchEventByTitle(@PathVariable String title){
        return eventService.fetchEventByTitle(title);

    }

}
