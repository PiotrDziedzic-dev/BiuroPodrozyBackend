package com.kodilla.biuro.domain;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CARS")
public class Car {


    @Id
    @GeneratedValue
    @NotNull
    @Column
    private Long carId;

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
