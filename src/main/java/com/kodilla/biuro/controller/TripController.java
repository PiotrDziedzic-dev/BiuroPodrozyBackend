package com.kodilla.biuro.controller;

import com.kodilla.biuro.domain.InvoiceDto;
import com.kodilla.biuro.domain.TripDto;
import com.kodilla.biuro.domain.UserDto;
import com.kodilla.biuro.mapper.InvoiceMapper;
import com.kodilla.biuro.mapper.TripMapper;
import com.kodilla.biuro.mapper.UserMapper;
import com.kodilla.biuro.service.InvoiceDatabase;
import com.kodilla.biuro.service.TripDatabase;
import com.kodilla.biuro.service.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/Invoice")
@CrossOrigin("*")
public class TripController {

    private final TripMapper tripMapper;
    private final TripDatabase tripDatabase;
    private final UserDatabase userDatabase;
    private final UserMapper userMapper;

    @Autowired
    public TripController(TripMapper tripMapper,TripDatabase tripDatabase,UserDatabase userDatabase,UserMapper userMapper ) {
        this.tripDatabase = tripDatabase;
        this.tripMapper = tripMapper;
        this.userDatabase = userDatabase;
        this.userMapper = userMapper;

    }

    @RequestMapping(method = RequestMethod.GET, value = "/getUserTrips")
    public List<TripDto> getUserInvoices(@RequestBody UserDto userDto) {
        return tripMapper.mapToTripDtoList(tripDatabase.getUserPastTrips(userMapper.mapToUser(userDto)));
    }
    @RequestMapping(method = RequestMethod.GET, value = "/getBestsellersTrips")
    public List<TripDto> getBestsellerTrips() {
        return tripMapper.mapToTripDtoList(tripDatabase.getBestsellers());
    }
    @RequestMapping(method = RequestMethod.GET, value = "/getLastMinuteTrips")
    public List<TripDto> getLastMinuteTrips() {
        return tripMapper.mapToTripDtoList(tripDatabase.getLastMinuteTrips());
    }

}
