package com.synerzip.service;

import com.synerzip.model.User;
import com.synerzip.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAllUser() {
        return userRepository.findAll();
    }
}
