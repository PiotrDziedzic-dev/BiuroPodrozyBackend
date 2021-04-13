package com.kodilla.biuro.service;


import com.kodilla.biuro.domain.Car;
import com.kodilla.biuro.repository.CarRepository;
import com.kodilla.biuro.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CarDatabaseFacade {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private UserRepository userRepository;


    public List<Car> getAvailableCars() {
        return carRepository.retrieveAvailableCars();
    }

    public void rentCar(Long carId, Long userId) {
        carRepository.findCarByCarId(carId).setIsAvailable(false);
        carRepository.findCarByCarId(carId).setUser(userRepository.findByUserId(userId));
    }

    public void returnCar(Long carId, Long userId) {
        carRepository.findCarByCarId(carId).setIsAvailable(true);
        carRepository.findCarByCarId(carId).setUser(null);
    }


}
