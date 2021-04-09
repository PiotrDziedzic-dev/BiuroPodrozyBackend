package com.kodilla.biuro.mapper;

import com.kodilla.biuro.domain.Car;
import com.kodilla.biuro.domain.CarDto;
import com.kodilla.biuro.domain.Trip;
import com.kodilla.biuro.domain.TripDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TripMapper {

    UserMapper userMapper;

    public TripDto mapToTripDto(final Trip trip) {
        return new TripDto(
            trip.getTripId(),
            userMapper.mapToUserDto(trip.getUser()),
            trip.getCountry(),
            trip.getExpense(),
            trip.getBeginDate(),
            trip.getBeginDate(),
            trip.getPast()
        );
    }

    public Trip mapToTrip(final TripDto tripDto) {
        return new Trip(
                tripDto.getTripId(),
                userMapper.mapToUser(tripDto.getUserDto()),
                tripDto.getCountry(),
                tripDto.getExpense(),
                tripDto.getBeginDate(),
                tripDto.getBeginDate(),
                tripDto.getPast()
        );
    }

    public List<TripDto> mapToCarDtoList(final List<Trip> tripList) {
        return tripList.stream()
                .map(this::mapToTripDto)
                .collect(Collectors.toList());
    }
}
