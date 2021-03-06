package com.kodilla.biuro.controller;

import com.kodilla.biuro.domain.TripDto;
import com.kodilla.biuro.domain.UserDto;
import com.kodilla.biuro.mapper.TripMapper;
import com.kodilla.biuro.mapper.UserMapper;
import com.kodilla.biuro.service.TripDatabaseFacade;
import com.kodilla.biuro.service.UserDatabaseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("v1/Invoice")
@CrossOrigin("*")
public class TripController {

    private final TripMapper tripMapper;
    private final TripDatabaseFacade tripDatabase;
    private final UserDatabaseFacade userDatabaseFacade;
    private final UserMapper userMapper;

    @Autowired
    public TripController(TripMapper tripMapper, TripDatabaseFacade tripDatabase, UserDatabaseFacade userDatabaseFacade, UserMapper userMapper ) {
        this.tripDatabase = tripDatabase;
        this.tripMapper = tripMapper;
        this.userDatabaseFacade = userDatabaseFacade;
        this.userMapper = userMapper;

    }

    @RequestMapping(method = RequestMethod.GET, value = "getUserTrips")
    public List<TripDto> getUserInvoices(@RequestBody UserDto userDto) {
        return tripMapper.mapToTripDtoList(tripDatabase.getUserPastTrips(userMapper.mapToUser(userDto)));
    }
    @RequestMapping(method = RequestMethod.GET, value = "getBestsellersTrips")
    public List<TripDto> getBestsellerTrips() {
        return tripMapper.mapToTripDtoList(tripDatabase.getBestsellers());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getLastMinuteTrips")
    public List<TripDto> getLastMinuteTrips() {
        return tripMapper.mapToTripDtoList(tripDatabase.getLastMinuteTrips());
    }

    @RequestMapping(method = RequestMethod.GET, value = "findTrip")
    public List<TripDto> findTrip(@RequestParam String country, @RequestParam Date startingDate, @RequestParam Date endingDate) {
        return tripMapper.mapToTripDtoList(tripDatabase.findTrip(country,startingDate,endingDate));
    }
    @RequestMapping(method = RequestMethod.GET, value = "getUpcomingTrips")
    private List<TripDto> getUpcomingTrips(@RequestParam Long userId){
        return tripMapper.mapToTripDtoList(tripDatabase.getUpcomingTrips(userId));
    }

}
