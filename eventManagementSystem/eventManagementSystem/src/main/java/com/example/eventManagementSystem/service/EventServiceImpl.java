package com.example.eventManagementSystem.service;

import com.example.eventManagementSystem.model.Event;
import com.example.eventManagementSystem.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService{
    @Autowired
    private EventRepository eventRepository;
    @Override
    public Event saveEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public List<Event> fetchEvent() {
        return eventRepository.findAll();
    }

    @Override
    public Event fetchEventById(Long id) {
        return eventRepository.findById(id).get();
    }

    @Override
    public void deleteEventById(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public Event updateEvent(Long id, Event event) {
        Optional<Event> existingEventOptional = eventRepository.findById(id);
        if(existingEventOptional.isPresent()){
          Event existingEvent = existingEventOptional.get();
          if(event.getTitle() !=null){
              existingEvent.setTitle(event.getTitle());
          }
          if(event.getDescription() !=null){
              existingEvent.setDescription(event.getDescription());
          }
          if(event.getDate() !=null){
              existingEvent.setDate(event.getDate());
          }
          if(event.getLocation() != null){
              existingEvent.setLocation(event.getLocation());
          }
          if(event.getCapacity() !=null){
              existingEvent.setCapacity(event.getCapacity());
          }
          return eventRepository.save(existingEvent);
        }else {
            throw new RuntimeException("Id not found exception" + id);
        }

    }

    @Override
    public Event fetchEventByTitle(String title) {
        return eventRepository.findByTitleIgnoreCase(title);
    }


}
