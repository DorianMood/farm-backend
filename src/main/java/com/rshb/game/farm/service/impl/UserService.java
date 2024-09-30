package com.rshb.game.farm.service.impl;

import com.rshb.game.farm.model.User;
import com.rshb.game.farm.service.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Optional<User> getUser (UUID id){
        return userRepository.findById(id);
    }

}
