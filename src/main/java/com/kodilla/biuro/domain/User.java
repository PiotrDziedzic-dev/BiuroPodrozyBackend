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
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    @NotNull
    @Column
    private Long userId;

    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private Integer pesel;
    @Column
    private Integer phoneNumber;
    @Column
    private String login;
    @Column
    private String password;
    @Column
    private String emailAddress;
}
