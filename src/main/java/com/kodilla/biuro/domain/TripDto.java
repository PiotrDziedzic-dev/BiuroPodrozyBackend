package com.kodilla.biuro.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TripDto {

    private Long tripId;
    private UserDto userDto;
    private String country;
    private Integer expense;
    private Date beginDate;
    private Date endingDate;
    private Boolean past;
    private Boolean lastMinute;
    private Boolean bestSeller;
}
