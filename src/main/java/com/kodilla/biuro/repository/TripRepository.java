package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.Trip;
import com.kodilla.biuro.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface TripRepository extends CrudRepository<Trip, Long> {

    @Query(nativeQuery = true)
    List<Trip> retrieveBestsellerTrips();
    @Query(nativeQuery = true)
    List<Trip> retrieveLastMinuteTrips();


    @Override
    List<Trip> findAll();

    List<Trip> findTripByUser(User user);


}
