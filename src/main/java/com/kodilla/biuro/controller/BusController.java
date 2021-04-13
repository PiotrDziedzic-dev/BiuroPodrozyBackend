package com.kodilla.biuro.controller;

import com.kodilla.biuro.domain.BusDto;
import com.kodilla.biuro.mapper.BusMapper;
import com.kodilla.biuro.service.BusDatabaseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/Bus")
@CrossOrigin("*")
public class BusController {

    private final BusDatabaseFacade busDatabaseFacade;
    private final BusMapper busMapper;

    @Autowired
    public BusController(BusDatabaseFacade busDatabaseFacade, BusMapper busMapper) {
        this.busDatabaseFacade = busDatabaseFacade;
        this.busMapper = busMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getBuses")
    public List<BusDto> getBuses() {
        return busMapper.mapToBusDtoList(busDatabaseFacade.getAvailableBuses());
    }

    @RequestMapping(method = RequestMethod.POST, value = "/rentBus")
    public void rentBus(@RequestParam Long busId, @RequestParam Long userId) {
        busDatabaseFacade.rentBus(busId,userId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/returnBus")
    public void returnBus(@RequestParam Long busId, @RequestParam Long userId) {
        busDatabaseFacade.returnBus(busId,userId);
    }




}
