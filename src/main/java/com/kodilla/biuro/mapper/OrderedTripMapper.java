package com.kodilla.biuro.mapper;

import com.kodilla.biuro.domain.OrderedTrip;
import com.kodilla.biuro.domain.OrderedTripDto;
import com.kodilla.biuro.domain.Trip;
import com.kodilla.biuro.domain.TripDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderedTripMapper {

    UserMapper userMapper;

    public OrderedTripDto mapToOrderedTripDto(final OrderedTrip orderedTrip) {
        return new OrderedTripDto(
                orderedTrip.getTripId(),
                orderedTrip.getCountry(),
                orderedTrip.getExpense(),
                orderedTrip.getBeginDate(),
                orderedTrip.getEndingDate(),
                orderedTrip.getIsPaid(),
                userMapper.mapToUserDto(orderedTrip.getUser()),
                orderedTrip.getAccommodation(),
                orderedTrip.getFeeding(),
                orderedTrip.getTransport()
        );
    }

    public OrderedTrip mapToOrderedTrip(final OrderedTripDto orderedTripDto) {
        return new OrderedTrip(
                orderedTripDto.getTripId(),
                orderedTripDto.getCountry(),
                orderedTripDto.getExpense(),
                orderedTripDto.getBeginDate(),
                orderedTripDto.getEndingDate(),
                orderedTripDto.getIsPaid(),
                userMapper.mapToUser(orderedTripDto.getUserDto()),
                orderedTripDto.getAccommodation(),
                orderedTripDto.getFeeding(),
                orderedTripDto.getTransport()

        );
    }

    public List<OrderedTripDto> mapToOrderedTripDtoList(final List<OrderedTrip> orderedTripList) {
        return orderedTripList.stream()
                .map(this::mapToOrderedTripDto)
                .collect(Collectors.toList());
    }
}
