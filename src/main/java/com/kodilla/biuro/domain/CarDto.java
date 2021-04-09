package com.kodilla.biuro.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CarDto {
    private Long carId;
    private String brand;
    private String model;
    private Integer yearOfProduction;
    private Boolean isAvailable;
    private UserDto userDto;

}
