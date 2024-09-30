package com.rshb.game.farm.controller;

import com.rshb.game.farm.api.resp.UserResp;
import com.rshb.game.farm.model.User;
import com.rshb.game.farm.service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import static com.rshb.game.farm.util.URLConstant.API;
import static com.rshb.game.farm.util.URLConstant.V1;

@RestController
@RequiredArgsConstructor
@RequestMapping((API + V1 +"/user"))
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<UserResp> getUser() {
        var principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        Optional<User> user = userService.getUser(principal.getId());

        return user.map(value -> ResponseEntity.ok(UserResp.builder()
                .id(value.getId())
                .balance(value.getFarmInventory().getBalance())
                .createdAt(value.getCreateAt())
                .username(value.getUsername())
                .build())).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
