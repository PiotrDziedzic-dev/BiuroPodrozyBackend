package com.kodilla.biuro.service;

import com.kodilla.biuro.domain.Car;
import com.kodilla.biuro.domain.Helicopter;
import com.kodilla.biuro.repository.HelicopterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HelicopterDatabase {

    @Autowired
    HelicopterRepository helicopterRepository;

    public List<Helicopter> getHelicopters() {
        return helicopterRepository.findAll();
    }

}
