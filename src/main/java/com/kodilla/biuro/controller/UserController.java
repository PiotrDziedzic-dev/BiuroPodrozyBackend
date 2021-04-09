package com.kodilla.biuro.controller;


import com.kodilla.biuro.domain.InvoiceDto;
import com.kodilla.biuro.domain.TripDto;
import com.kodilla.biuro.domain.UserDto;
import com.kodilla.biuro.mapper.BoatMapper;
import com.kodilla.biuro.mapper.TripMapper;
import com.kodilla.biuro.mapper.UserMapper;
import com.kodilla.biuro.service.BoatDatabase;
import com.kodilla.biuro.service.TripDatabase;
import com.kodilla.biuro.service.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("v1/User")
public class UserController {

    private final UserDatabase userDatabase;
    private final UserMapper userMapper;
    private final TripDatabase tripDatabase;
    private final TripMapper tripMapper;

    @Autowired
    public UserController(UserDatabase userDatabase, UserMapper userMapper, TripDatabase tripDatabase, TripMapper tripMapper) {
        this.userDatabase = userDatabase;
        this.userMapper = userMapper;
        this.tripDatabase = tripDatabase;
        this.tripMapper = tripMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getPastTrips")
    public List<TripDto> getPastTrips(@RequestBody UserDto userDto) {
        return tripMapper.mapToCarDtoList(tripDatabase.getUserPastTrips(userMapper.mapToUser(userDto)));
    }

    @RequestMapping(method = RequestMethod.GET, value = "getInvoices")
    public List<InvoiceDto> getInvoices

}
