package com.kodilla.biuro.service;

import com.kodilla.biuro.domain.Boat;
import com.kodilla.biuro.repository.BoatRepository;
import com.kodilla.biuro.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoatDatabase {

    @Autowired
    private BoatRepository boatRepository;

    @Autowired
    private UserRepository userRepository;


    public List<Boat> getBoats() {
        return boatRepository.findAll();
    }

    public void rentBoat(Long boatId, Long userId) {
        boatRepository.findBoatByBoatId(boatId).setIsAvailable(false);
        boatRepository.findBoatByBoatId(boatId).setUser(userRepository.findByUserId(userId));
    }

    public void returnBoat(Long boatId, Long userId) {
        boatRepository.findBoatByBoatId(boatId).setIsAvailable(true);
        boatRepository.findBoatByBoatId(boatId).setUser(null);
    }

}
