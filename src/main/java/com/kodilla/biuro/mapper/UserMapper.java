package com.kodilla.biuro.mapper;

import com.kodilla.biuro.domain.User;
import com.kodilla.biuro.domain.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public UserDto mapToUserDto(final User user) {
        return new UserDto(
                user.getUserId(),
                user.getName(),
                user.getSurname(),
                user.getPesel(),
                user.getPhoneNumber(),
                user.getLogin(),
                user.getPassword(),
                user.getEmailAddress()
        );
    }

    public User mapToUser(final UserDto userDto) {
        return new User(
                userDto.getUserId(),
                userDto.getName(),
                userDto.getSurname(),
                userDto.getPesel(),
                userDto.getPhoneNumber(),
                userDto.getLogin(),
                userDto.getPassword(),
                userDto.getEmailAddress()
        );
    }
}
