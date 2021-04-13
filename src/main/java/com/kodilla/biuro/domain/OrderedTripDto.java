package com.kodilla.biuro.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderedTripDto {

    private Long tripId;
    private String country;
    private Integer expense;
    private Date beginDate;
    private Date endingDate;
    private Boolean isPaid;
    private UserDto userDto;
    private String accommodation;
    private String feeding;
    private String transport;

}
