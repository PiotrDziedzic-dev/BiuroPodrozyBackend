package com.kodilla.biuro.domain;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table("cars")
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

}
