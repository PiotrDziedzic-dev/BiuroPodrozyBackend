package com.kodilla.biuro.service;

import com.kodilla.biuro.domain.Car;
import com.kodilla.biuro.domain.Helicopter;
import com.kodilla.biuro.repository.HelicopterRepository;
import com.kodilla.biuro.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HelicopterDatabaseFacade {

    @Autowired
    HelicopterRepository helicopterRepository;

    @Autowired
    UserRepository userRepository;

    public List<Helicopter> getAvailableHelicopters() {
        return helicopterRepository.retrieveAvailableHelicopters();
    }

    public void rentHelicopter(Long helicopterId, Long userId) {
        helicopterRepository.findByHelicopterId(helicopterId).setIsAvailable(false);
        helicopterRepository.findByHelicopterId(helicopterId).setUser(userRepository.findByUserId(userId));
    }

    public void returnHelicopter(Long helicopterId, Long userId) {
        helicopterRepository.findByHelicopterId(helicopterId).setIsAvailable(true);
        helicopterRepository.findByHelicopterId(helicopterId).setUser(null);
    }

}
