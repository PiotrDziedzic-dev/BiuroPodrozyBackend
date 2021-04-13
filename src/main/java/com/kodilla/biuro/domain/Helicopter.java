package com.kodilla.biuro.domain;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;


@NamedNativeQuery(
        name = "Trip.retrieveAvailableHelicopters",
        query = "SELECT * FROM HELICOPTERS WHERE isAvailable = true",
        resultClass = Helicopter.class
)

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "HELICOPTERS")
public class Helicopter {


    @Id
    @GeneratedValue
    @NotNull
    @Column
    private Long helicopterId;

    @Column
    private String brand;
    @Column
    private String model;
    @Column
    private Integer yearOfProduction;
    @Column
    private Boolean isAvailable;
    @Column
    private User user;

}
