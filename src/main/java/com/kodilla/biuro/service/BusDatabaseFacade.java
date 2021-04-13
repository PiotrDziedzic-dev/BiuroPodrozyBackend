package com.kodilla.biuro.service;

import com.kodilla.biuro.domain.Bus;
import com.kodilla.biuro.domain.Car;
import com.kodilla.biuro.repository.BusRepository;
import com.kodilla.biuro.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BusDatabaseFacade {

    @Autowired
    BusRepository busRepository;

    @Autowired
    UserRepository userRepository;

    public List<Bus> getAvailableBuses() {
        return busRepository.retrieveAvailableBusses();
    }

    public void rentBus(Long busId, Long userId) {
        busRepository.findBusByBusId(busId).setIsAvailable(false);
        busRepository.findBusByBusId(busId).setUser(userRepository.findByUserId(userId));
    }

    public void returnBus(Long busId, Long userId) {
        busRepository.findBusByBusId(busId).setIsAvailable(true);
        busRepository.findBusByBusId(busId).setUser(null);
    }
}
