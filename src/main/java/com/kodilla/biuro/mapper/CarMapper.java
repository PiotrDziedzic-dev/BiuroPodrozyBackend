package com.kodilla.biuro.mapper;


import com.kodilla.biuro.domain.Car;
import com.kodilla.biuro.domain.CarDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarMapper {

    public CarDto mapToCarDto(final Car car) {
        return new CarDto(
                car.getCarId(),
                car.getBrand(),
                car.getModel(),
                car.getYearOfProduction(),
                car.getIsAvailable()
        );
    }

    public Car mapToCar(final CarDto carDto) {
        return new Car(
                carDto.getCarId(),
                carDto.getBrand(),
                carDto.getModel(),
                carDto.getYearOfProduction(),
                carDto.getIsAvailable()
        );
    }

    public List<CarDto> mapToCarDtoList(final List<Car> carList) {
        return carList.stream()
                .map(this::mapToCarDto)
                .collect(Collectors.toList());
    }
}
