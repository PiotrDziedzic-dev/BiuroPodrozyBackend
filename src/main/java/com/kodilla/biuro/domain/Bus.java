package com.kodilla.biuro.domain;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@NamedNativeQuery(
        name = "Trip.retrieveAvailableBuses",
        query = "SELECT * FROM BUSSES WHERE isAvailable = true",
        resultClass = Bus.class
)

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BUSSES")
public class Bus {


    @Id
    @GeneratedValue
    @NotNull
    @Column
    private Long busId;

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
