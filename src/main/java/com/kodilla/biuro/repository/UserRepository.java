package com.kodilla.biuro.repository;

import com.kodilla.biuro.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserId(Long userId);
}
