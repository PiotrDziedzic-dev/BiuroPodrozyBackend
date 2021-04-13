package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.Boat;
import com.kodilla.biuro.domain.Bus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BusRepository extends CrudRepository<Bus, Long> {

    @Query(nativeQuery = true)
    List<Bus> retrieveAvailableBusses();

    Bus findBusByBusId(Long busID);
}
