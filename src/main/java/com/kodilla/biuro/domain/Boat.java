package com.kodilla.biuro.domain;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@NamedNativeQuery(
        name = "Trip.retrieveAvailableBoats",
        query = "SELECT * FROM BOATS WHERE isAvailable = true",
        resultClass = Boat.class
)

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BOATS")
public class Boat {


    @Id
    @GeneratedValue
    @NotNull
    @Column
    private Long boatId;

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
