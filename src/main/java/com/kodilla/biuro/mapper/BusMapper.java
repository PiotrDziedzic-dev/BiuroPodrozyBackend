package com.kodilla.biuro.mapper;


import com.kodilla.biuro.domain.Bus;
import com.kodilla.biuro.domain.BusDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BusMapper {

    UserMapper userMapper;

    public BusDto mapToBusDto(final Bus bus) {
        return new BusDto(
                bus.getBusId(),
                bus.getBrand(),
                bus.getModel(),
                bus.getYearOfProduction(),
                bus.getIsAvailable(),
                userMapper.mapToUserDto(bus.getUser())
        );
    }

    public Bus mapToBus(final BusDto busDto) {
        return new Bus(
                busDto.getBusId(),
                busDto.getBrand(),
                busDto.getModel(),
                busDto.getYearOfProduction(),
                busDto.getIsAvailable(),
                userMapper.mapToUser(busDto.getUserDto())
        );
    }

    public List<BusDto> mapToBusDtoList(final List<Bus> busList) {
        return busList.stream()
                .map(this::mapToBusDto)
                .collect(Collectors.toList());
    }
}
