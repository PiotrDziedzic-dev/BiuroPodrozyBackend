package com.kodilla.biuro.controller;

import com.kodilla.biuro.domain.BoatDto;
import com.kodilla.biuro.mapper.BoatMapper;
import com.kodilla.biuro.service.BoatDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/Boat")
@CrossOrigin("*")
public class BoatController {

    private final BoatDatabase boatDatabase;
    private final BoatMapper boatMapper;

    @Autowired
    public BoatController(BoatDatabase boatDatabase, BoatMapper boatMapper) {
        this.boatDatabase = boatDatabase;
        this.boatMapper = boatMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getBoats")
    public List<BoatDto> getBoats() {
        return boatMapper.mapToBoatDtoList(boatDatabase.getBoats());
    }

}
