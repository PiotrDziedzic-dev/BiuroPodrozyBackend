package com.kodilla.biuro.controller;


import com.kodilla.biuro.mapper.TripMapper;
import com.kodilla.biuro.mapper.UserMapper;
import com.kodilla.biuro.service.TripDatabaseFacade;
import com.kodilla.biuro.service.UserDatabaseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequestMapping("v1/User")
public class UserController {

    private final UserDatabaseFacade userDatabaseFacade;
    private final UserMapper userMapper;
    private final TripDatabaseFacade tripDatabase;
    private final TripMapper tripMapper;

    @Autowired
    public UserController(UserDatabaseFacade userDatabaseFacade, UserMapper userMapper, TripDatabaseFacade tripDatabase, TripMapper tripMapper) {
        this.userDatabaseFacade = userDatabaseFacade;
        this.userMapper = userMapper;
        this.tripDatabase = tripDatabase;
        this.tripMapper = tripMapper;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/changeUserName")
    public void changeName() {


    }


}
