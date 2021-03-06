package com.kodilla.biuro.mapper;


import com.kodilla.biuro.domain.Helicopter;
import com.kodilla.biuro.domain.HelicopterDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HelicopterMapper {

    UserMapper userMapper;

    public HelicopterDto mapToHelicopterDto(final Helicopter helicopter) {
        return new HelicopterDto(
                helicopter.getHelicopterId(),
                helicopter.getBrand(),
                helicopter.getModel(),
                helicopter.getYearOfProduction(),
                helicopter.getIsAvailable(),
                userMapper.mapToUserDto(helicopter.getUser())

        );
    }

    public Helicopter mapToHelicopter(final HelicopterDto helicopterDto) {
        return new Helicopter(
                helicopterDto.getHelicopterId(),
                helicopterDto.getBrand(),
                helicopterDto.getModel(),
                helicopterDto.getYearOfProduction(),
                helicopterDto.getIsAvailable(),
                userMapper.mapToUser(helicopterDto.getUserDto())
        );
    }

    public List<HelicopterDto> mapToHelicopterDtoList(final List<Helicopter> helicoptersList) {
        return helicoptersList.stream()
                .map(this::mapToHelicopterDto)
                .collect(Collectors.toList());
    }
}
