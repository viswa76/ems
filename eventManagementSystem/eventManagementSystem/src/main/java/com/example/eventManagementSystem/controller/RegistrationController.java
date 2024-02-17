//package com.example.eventManagementSystem.controller;
//
//import com.example.eventManagementSystem.model.Event;
//import com.example.eventManagementSystem.model.Registration;
//import com.example.eventManagementSystem.service.RegistrationService;
//import jakarta.validation.Valid;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//@RestController
//@CrossOrigin
//public class RegistrationController {
//    @Autowired
//    private RegistrationService registrationService;
//    private final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
//
//    @PostMapping("/registrations")
//    public Registration saveRegistration(@Valid @RequestBody Registration registration){
//        logger.info("Inside saveRegistration of registrationController");
//        return registrationService.saveRegistration(registration);
//    }
//    @GetMapping("/registrations")
//    public List<Registration> fetchRegistration(){
//        logger.info("Inside fetchRegistration of RegistrationController");
//        return registrationService.fetchRegistration();
//    }
//    @GetMapping("/registrations/{id}")
//    public Registration fetchByID(@PathVariable("id") Long id){
//        return registrationService.fetchById(id);
//    }
//    @DeleteMapping("/registrations/{id}")
//    public String deleteById(@PathVariable("id") Long id){
//        registrationService.deleteById(id);
//        return "Deleted Successfully";
//    }
//    @PutMapping("/registrations/{id}")
//    public Registration updateRegistration(@PathVariable("id") Long id , @RequestBody Registration registration){
//        return registrationService.updateRegistration(id,registration);
//    }
//
//}
