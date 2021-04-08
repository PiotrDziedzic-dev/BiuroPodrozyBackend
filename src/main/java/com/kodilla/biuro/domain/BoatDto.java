package com.kodilla.biuro.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BoatDto {
    private Long boatId;
    private String brand;
    private String model;
    private Integer yearOfProduction;
    private Boolean isAvailable;

}
