package com.postgresql.registeringUser.service;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.postgresql.registeringUser.model.User;
import com.postgresql.registeringUser.repository.UserRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void registerUser(User user) {
        userRepository.save(user);
    }
}
