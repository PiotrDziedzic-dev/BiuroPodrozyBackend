package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.Boat;
import com.kodilla.biuro.domain.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long>  {

    @Query(nativeQuery = true)
    List<Car> retrieveAvailableCars();

    Car findCarByCarId(Long carId);
}
