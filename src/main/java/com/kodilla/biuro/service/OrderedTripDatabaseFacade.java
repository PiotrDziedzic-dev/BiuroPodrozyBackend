package com.kodilla.biuro.service;

import com.kodilla.biuro.domain.OrderedTrip;
import com.kodilla.biuro.domain.Trip;
import com.kodilla.biuro.repository.OrderedTripRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderedTripDatabaseFacade {

    @Autowired
    OrderedTripRepository orderedTripRepository;

    public List<OrderedTrip> getUpcomingTrips(Long userId) {
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        return orderedTripRepository.findingUpcomingTrips(userId,date);
    }
    public OrderedTrip saveOrderedTrip(final OrderedTrip orderedTrip){
        return orderedTripRepository.save(orderedTrip);
    }


}
