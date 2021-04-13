package com.kodilla.biuro.controller;


import com.kodilla.biuro.domain.OrderedTrip;
import com.kodilla.biuro.domain.OrderedTripDto;
import com.kodilla.biuro.mapper.BoatMapper;
import com.kodilla.biuro.mapper.OrderedTripMapper;
import com.kodilla.biuro.service.BoatDatabaseFacade;
import com.kodilla.biuro.service.OrderedTripDatabaseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/OrderedTrip")
@CrossOrigin("*")
public class OrderedTripController {

    private final OrderedTripDatabaseFacade orderedTripDatabaseFacade;
    private final OrderedTripMapper orderedTripMapper;

    @Autowired
    public OrderedTripController(OrderedTripDatabaseFacade orderedTripDatabaseFacade, OrderedTripMapper orderedTripMapper) {
        this.orderedTripDatabaseFacade = orderedTripDatabaseFacade;
        this.orderedTripMapper = orderedTripMapper;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "editOrderedTrip")
    public OrderedTripDto editOrderedTrip(OrderedTripDto orderedTripDto) {
        OrderedTrip updatingTrip = orderedTripDatabaseFacade.saveOrderedTrip(orderedTripMapper.mapToOrderedTrip(orderedTripDto));
        return orderedTripMapper.mapToOrderedTripDto(updatingTrip);
    }
}
