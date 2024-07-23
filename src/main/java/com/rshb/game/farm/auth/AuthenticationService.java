package com.rshb.game.farm.auth;

import com.rshb.game.farm.auth.AuthenticationRequest;
import com.rshb.game.farm.auth.AuthenticationResponse;
import com.rshb.game.farm.auth.RegisterRequest;
import com.rshb.game.farm.model.*;
import com.rshb.game.farm.security.JwtService;
import com.rshb.game.farm.service.UserRepository;
import com.rshb.game.farm.util.Generate;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public AuthenticationResponse register(RegisterRequest registerRequest) {
        var user = User.builder()
                .login(registerRequest.getUsername())
                .email(registerRequest.getEmail())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .role(Role.USER)
                .build();
        user.setFarmInventory(FarmInventory.builder()
                .user(user)
                .balance(100)
                .build());
        user.setBedList(Generate.generateBed(10,user));
        user.setCorralList(Generate.generateCorral(4,user));

        userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        var user = userRepository.findByLogin(request.getUsername())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
