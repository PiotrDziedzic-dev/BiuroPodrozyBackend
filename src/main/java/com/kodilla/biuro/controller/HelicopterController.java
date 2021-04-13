package com.kodilla.biuro.controller;

import com.kodilla.biuro.domain.HelicopterDto;
import com.kodilla.biuro.mapper.HelicopterMapper;
import com.kodilla.biuro.service.HelicopterDatabaseFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/Helicopter")
@CrossOrigin("*")
public class HelicopterController {

    private final HelicopterDatabaseFacade helicopterDatabaseFacade;
    private final HelicopterMapper helicopterMapper;

    public HelicopterController(HelicopterDatabaseFacade helicopterDatabaseFacade, HelicopterMapper helicopterMapper) {
        this.helicopterDatabaseFacade = helicopterDatabaseFacade;
        this.helicopterMapper = helicopterMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getHelicopters")
    public List<HelicopterDto> getHelicopters() {
        return helicopterMapper.mapToHelicopterDtoList(helicopterDatabaseFacade.getAvailableHelicopters());
    }
    @RequestMapping(method = RequestMethod.POST, value = "/rentHelicopter")
    public void rentHelicopter(@RequestParam Long helicopterId, @RequestParam Long userId) {
        helicopterDatabaseFacade.rentHelicopter(helicopterId,userId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/returnHelicopter")
    public void returnCar(@RequestParam Long helicopterId, @RequestParam Long userId) {
        helicopterDatabaseFacade.returnHelicopter(helicopterId,userId);
    }
}
