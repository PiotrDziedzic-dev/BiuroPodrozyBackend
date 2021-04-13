package com.kodilla.biuro.domain;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;


@NamedNativeQuery(
        name = "OrderedTrip.findingUpcomingTrips",
        query = "SELECT * FROM TRIPS WHERE user = :USERID AND beginDate > :TODAYDATE",
        resultClass = OrderedTrip.class
)


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDEREDTRIPS")
public class OrderedTrip {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long tripId;
    @Column
    private String country;
    @Column
    private Integer expense;
    @Column
    private Date beginDate;
    @Column
    private Date endingDate;
    @Column
    private Boolean isPaid;
    @Column
    private User user;
    @Column
    private String accommodation;
    @Column
    private String feeding;
    @Column
    private String transport;

}
