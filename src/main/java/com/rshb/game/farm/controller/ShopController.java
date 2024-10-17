package com.rshb.game.farm.controller;

import com.rshb.game.farm.auth.AuthenticationService;
import com.rshb.game.farm.model.InventoryItem;
import com.rshb.game.farm.model.ShopItem;
import com.rshb.game.farm.model.User;
import com.rshb.game.farm.service.InventoryService;
import com.rshb.game.farm.service.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.rshb.game.farm.util.URLConstant.API;
import static com.rshb.game.farm.util.URLConstant.V1;

@RestController
@RequiredArgsConstructor
@RequestMapping(API + V1 + "/products")
public class ShopController {

    private final AuthenticationService authenticationService;

    private final ShopRepository shopRepository;


    @GetMapping
    public ResponseEntity<List<ShopItem>> getAllShopItems() {
        var principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return ResponseEntity.ok(shopRepository.findAll());
    }
}
