package com.gabrielgodoi.userapi.services;

import com.gabrielgodoi.userapi.domain.User;
import com.gabrielgodoi.userapi.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;


    public List<User> findAll() {
        return this.userRepository.findAll();
    }
}
