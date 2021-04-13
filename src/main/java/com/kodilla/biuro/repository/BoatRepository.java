package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.Boat;
import com.kodilla.biuro.domain.Car;
import com.kodilla.biuro.domain.Trip;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BoatRepository extends CrudRepository<Boat, Long> {

    @Query(nativeQuery = true)
    List<Boat> retrieveAvailableBoats();

    Boat findBoatByBoatId(Long boatId);
}
