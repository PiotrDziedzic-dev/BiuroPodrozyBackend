package com.kodilla.biuro.service;


import com.kodilla.biuro.domain.Car;
import com.kodilla.biuro.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CarDatabase {

    @Autowired
    private CarRepository carRepository;


    public List<Car> getCars() {
        return carRepository.findAll();
    }

}
