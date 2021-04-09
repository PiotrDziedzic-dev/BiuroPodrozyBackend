package com.kodilla.biuro.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TRIPS")
public class Trip {


    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long tripId;

    @Column
    private User user;
    @Column
    private String country;
    @Column
    private Integer expense;
    @Column
    private Date beginDate;
    @Column
    private Date endingDate;
    @Column
    private Boolean past;
}
