package com.kodilla.biuro.controller;

import com.kodilla.biuro.domain.CarDto;
import com.kodilla.biuro.mapper.CarMapper;
import com.kodilla.biuro.service.CarDatabase;
import lombok.RequiredArgsConstructor;
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

}
