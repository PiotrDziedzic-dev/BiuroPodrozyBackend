package com.kodilla.biuro.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;

@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class UserDto {

    private Long userId;
    private String name;
    private String surname;
    private Integer pesel;
    private Integer numerTelefonu;
    private String login;
    private String password;
    private String emailAddress;

}
