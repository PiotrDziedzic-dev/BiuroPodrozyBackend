package com.kodilla.biuro.mapper;


import com.kodilla.biuro.domain.Boat;
import com.kodilla.biuro.domain.BoatDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BoatMapper {

    UserMapper userMapper;

    public BoatDto mapToBoatDto(final Boat boat) {
        return new BoatDto(
                boat.getBoatId(),
                boat.getBrand(),
                boat.getModel(),
                boat.getYearOfProduction(),
                boat.getIsAvailable(),
                userMapper.mapToUserDto(boat.getUser())
        );
    }

    public Boat mapToBoat(final BoatDto boatDto) {
        return new Boat(
                boatDto.getBoatId(),
                boatDto.getBrand(),
                boatDto.getModel(),
                boatDto.getYearOfProduction(),
                boatDto.getIsAvailable(),
                userMapper.mapToUser(boatDto.getUserDto())
        );
    }

    public List<BoatDto> mapToBoatDtoList(final List<Boat> boatList) {
        return boatList.stream()
                .map(this::mapToBoatDto)
                .collect(Collectors.toList());
    }
}
