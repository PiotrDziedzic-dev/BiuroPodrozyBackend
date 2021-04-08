package com.kodilla.biuro.controller;

import com.kodilla.biuro.domain.BoatDto;
import com.kodilla.biuro.domain.HelicopterDto;
import com.kodilla.biuro.mapper.HelicopterMapper;
import com.kodilla.biuro.service.HelicopterDatabase;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/Helicopter")
@CrossOrigin("*")
public class HelicopterController {

    private final HelicopterDatabase helicopterDatabase;
    private final HelicopterMapper helicopterMapper;

    public HelicopterController(HelicopterDatabase helicopterDatabase, HelicopterMapper helicopterMapper) {
        this.helicopterDatabase = helicopterDatabase;
        this.helicopterMapper = helicopterMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getHelicopters")
    public List<HelicopterDto> getHelicopters() {
        return helicopterMapper.mapToHelicopterDtoList(helicopterDatabase.getHelicopters());
    }
}
