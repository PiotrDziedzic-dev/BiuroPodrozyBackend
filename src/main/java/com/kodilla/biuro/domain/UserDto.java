package com.kodilla.biuro.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long userId;
    private String name;
    private String surname;
    private Integer pesel;
    private Integer phoneNumber;
    private String login;
    private String password;
    private String emailAddress;

}
