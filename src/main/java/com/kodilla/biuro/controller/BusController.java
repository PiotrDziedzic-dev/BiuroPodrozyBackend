package com.kodilla.biuro.controller;

import com.kodilla.biuro.domain.BoatDto;
import com.kodilla.biuro.domain.BusDto;
import com.kodilla.biuro.mapper.BusMapper;
import com.kodilla.biuro.service.BusDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/Bus")
@CrossOrigin("*")
public class BusController {

    private final BusDatabase busDatabase;
    private final BusMapper busMapper;

    @Autowired
    public BusController(BusDatabase busDatabase, BusMapper busMapper) {
        this.busDatabase = busDatabase;
        this.busMapper = busMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getBuses")
    public List<BusDto> getBuses() {
        return busMapper.mapToBusDtoList(busDatabase.geBuses());
    }




}
