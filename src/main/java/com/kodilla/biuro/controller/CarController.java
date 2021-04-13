package com.kodilla.biuro.controller;

import com.kodilla.biuro.domain.CarDto;
import com.kodilla.biuro.mapper.CarMapper;
import com.kodilla.biuro.service.CarDatabaseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/Car")
@CrossOrigin("*")
public class CarController {

    private final CarDatabaseFacade carDatabaseFacade;
    private final CarMapper carMapper;

    @Autowired
    public CarController(CarDatabaseFacade carDatabaseFacade, CarMapper carMapper) {
        this.carDatabaseFacade = carDatabaseFacade;
        this.carMapper = carMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getCars")
    public List<CarDto> getCars() {
        return carMapper.mapToCarDtoList(carDatabaseFacade.getAvailableCars());
    }

    @RequestMapping(method = RequestMethod.POST, value = "/rentCar")
    public void rentCar(@RequestParam Long carId, @RequestParam Long userId) {
        carDatabaseFacade.rentCar(carId,userId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/returnCar")
    public void returnCar(@RequestParam Long carId, @RequestParam Long userId) {
        carDatabaseFacade.returnCar(carId,userId);
    }

}
