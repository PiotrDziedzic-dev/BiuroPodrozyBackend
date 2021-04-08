package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.Boat;
import com.kodilla.biuro.domain.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BoatRepository extends CrudRepository<Boat, Long> {

    @Override
    List<Boat> findAll();

    Boat findBoatByBoatId(Long boatId);
}
