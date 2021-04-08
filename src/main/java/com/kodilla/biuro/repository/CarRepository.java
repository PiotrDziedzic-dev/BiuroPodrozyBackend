package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long>  {

    @Override
    List<Car> findAll();
}
