package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.Trip;
import com.kodilla.biuro.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TripRepository extends CrudRepository<Trip, Long> {

    @Override
    List<Trip> findAll();

    List<Trip> findTripByUser(User user);
}
