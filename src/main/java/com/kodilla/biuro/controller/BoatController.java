package com.kodilla.biuro.controller;

import com.kodilla.biuro.domain.BoatDto;
import com.kodilla.biuro.mapper.BoatMapper;
import com.kodilla.biuro.service.BoatDatabaseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/Boat")
@CrossOrigin("*")
public class BoatController {

    private final BoatDatabaseFacade boatDatabaseFacade;
    private final BoatMapper boatMapper;

    @Autowired
    public BoatController(BoatDatabaseFacade boatDatabaseFacade, BoatMapper boatMapper) {
        this.boatDatabaseFacade = boatDatabaseFacade;
        this.boatMapper = boatMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getBoats")
    public List<BoatDto> getBoats() {
        return boatMapper.mapToBoatDtoList(boatDatabaseFacade.getAvailableBoats());
    }

    @RequestMapping(method = RequestMethod.POST, value = "rentBoat")
    public void rentBoat(@RequestParam Long boatId, @RequestParam Long userId) {
        boatDatabaseFacade.rentBoat(boatId,userId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "returnBoat")
    public void returnBoat(@RequestParam Long boatId, @RequestParam Long userId) {
        boatDatabaseFacade.returnBoat(boatId,userId);
    }


}
