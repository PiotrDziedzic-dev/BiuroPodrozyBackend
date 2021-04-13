package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.Trip;
import com.kodilla.biuro.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

@Transactional
@Repository
public interface TripRepository extends CrudRepository<Trip, Long> {

    @Query(nativeQuery = true)
    List<Trip> retrieveBestsellerTrips();
    @Query(nativeQuery = true)
    List<Trip> retrieveLastMinuteTrips();
    @Query(nativeQuery = true)
    List<Trip> findingTrip(@Param("COUNTRY") String country, @Param("STARTINGDATE") Date startingDate, @Param("ENDINGDATE") Date endingdate);


    @Override
    List<Trip> findAll();

    List<Trip> findTripByUser(User user);


}
