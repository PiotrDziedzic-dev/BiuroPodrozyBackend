package com.kodilla.biuro.service;

import com.kodilla.biuro.domain.Trip;
import com.kodilla.biuro.domain.User;
import com.kodilla.biuro.repository.TripRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TripDatabaseFacade {

    @Autowired
    TripRepository tripRepository;

    public List<Trip> getTrips() {
        return tripRepository.findAll();
    }

    public List<Trip> getUserPastTrips(User user) {
        return tripRepository.findTripByUser(user);
    }
    public List<Trip> getBestsellers() {
        return tripRepository.retrieveBestsellerTrips();
    }
    public List<Trip> getLastMinuteTrips() {
        return tripRepository.retrieveLastMinuteTrips();
    }
    public List<Trip> findTrip(String country, Date startingDate, Date endingDate) {
        return tripRepository.findingTrip(country,startingDate,endingDate);
    }


}
