package com.kodilla.biuro.service;

import com.kodilla.biuro.domain.Boat;
import com.kodilla.biuro.repository.BoatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoatDatabase {

    @Autowired
    private BoatRepository boatRepository;

    public List<Boat> getBoats() {
        return boatRepository.findAll();
    }

}
