package com.kodilla.biuro.service;

import com.kodilla.biuro.domain.Bus;
import com.kodilla.biuro.domain.Car;
import com.kodilla.biuro.repository.BusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BusDatabase {

    @Autowired
    BusRepository busRepository;

    public List<Bus> geBuses() {
        return busRepository.findAll();
    }
}
