package com.kodilla.biuro.service;

import com.kodilla.biuro.domain.Trip;
import com.kodilla.biuro.domain.User;
import com.kodilla.biuro.repository.TripRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TripDatabase {

    @Autowired
    TripRepository tripRepository;

    public List<Trip> getTrips() {
        return tripRepository.findAll();
    }

    public List<Trip> getUserPastTrips(User user) {
        return tripRepository.findTripByUser(user);
    }
}
