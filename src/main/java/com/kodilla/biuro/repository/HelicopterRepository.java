package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.Boat;
import com.kodilla.biuro.domain.Helicopter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HelicopterRepository extends CrudRepository<Helicopter, Long> {

    @Query(nativeQuery = true)
    List<Helicopter> retrieveAvailableHelicopters();

    Helicopter findByHelicopterId(Long helicopterId);

}
