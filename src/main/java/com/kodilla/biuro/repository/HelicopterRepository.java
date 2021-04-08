package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.Helicopter;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HelicopterRepository extends CrudRepository<Helicopter, Long> {

    @Override
    List<Helicopter> findAll();

    Helicopter findByHelicopterId(Long helicopterId);

}
