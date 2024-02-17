//package com.example.eventManagementSystem.service;
//
//import com.example.eventManagementSystem.model.Registration;
//import com.example.eventManagementSystem.repository.RegistrationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class RegistrationServiceImpl implements RegistrationService {
//
//    @Autowired
//    private RegistrationRepository registrationRepository;
//
//    @Override
//    public Registration saveRegistration(Registration registration) {
//        return registrationRepository.save(registration);
//    }
//
//    @Override
//    public List<Registration> fetchRegistration() {
//        return registrationRepository.findAll();
//    }
//
//    @Override
//    public Registration fetchById(Long id) {
//        Optional<Registration> optionalRegistration = registrationRepository.findById(id);
//        return optionalRegistration.orElse(null);
//    }
//
//    @Override
//    public void deleteById(Long id)
//    {
//        registrationRepository.deleteById(id);
//    }
//
//    @Override
//    public Registration updateRegistration(Long id, Registration registration) {
//        Optional<Registration> existingRegistrationOptional = registrationRepository.findById(id);
//        if (existingRegistrationOptional.isPresent()) {
//            Registration existingRegistration = existingRegistrationOptional.get();
//            if (registration.getUser() != null) {
//                existingRegistration.setUser(registration.getUser());
//            }
//            if (registration.getEvent() != null) {
//                existingRegistration.setEvent(registration.getEvent());
//            }
//            if (registration.getTicketId() != null && !registration.getTicketId().isEmpty()) {
//                existingRegistration.setTicketId(registration.getTicketId());
//            }
//            return registrationRepository.save(existingRegistration);
//        } else {
//            throw new RuntimeException("Registration not found with id: " + id);
//        }
//    }
//
//
//
//}
//
//
//
