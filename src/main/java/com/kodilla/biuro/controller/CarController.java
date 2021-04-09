package com.kodilla.biuro.controller;

import com.kodilla.biuro.domain.CarDto;
import com.kodilla.biuro.mapper.CarMapper;
import com.kodilla.biuro.service.CarDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/Car")
@CrossOrigin("*")
public class CarController {

    private final CarDatabase carDatabase;
    private final CarMapper carMapper;

    @Autowired
    public CarController(CarDatabase carDatabase,CarMapper carMapper) {
        this.carDatabase = carDatabase;
        this.carMapper = carMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getCars")
    public List<CarDto> getCars() {
        return carMapper.mapToCarDtoList(carDatabase.getCars());
    }

    @RequestMapping(method = RequestMethod.POST, value = "/rentCar")
    public void rentCar(@RequestParam Long carId, @RequestParam Long userId) {
        carDatabase.rentCar(carId,userId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/returnCar")
    public void returnCar(@RequestParam Long carId, @RequestParam Long userId) {
        carDatabase.returnCar(carId,userId);
    }

}
