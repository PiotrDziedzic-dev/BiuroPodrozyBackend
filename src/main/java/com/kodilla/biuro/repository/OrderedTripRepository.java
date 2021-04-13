package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.OrderedTrip;
import com.kodilla.biuro.domain.Trip;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface OrderedTripRepository extends CrudRepository<OrderedTrip, Long> {

    @Query(nativeQuery = true)
    List<OrderedTrip> findingUpcomingTrips(@Param("USERID") Long userId, @Param("TODAYDATE") Date today);

}
