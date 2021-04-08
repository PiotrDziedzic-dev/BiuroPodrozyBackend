package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.Bus;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BusRepository extends CrudRepository<Bus, Long> {

    @Override
    List<Bus> findAll();

    Bus findBusByBusId(Long busID);
}
