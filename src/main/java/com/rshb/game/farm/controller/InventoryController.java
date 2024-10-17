package com.rshb.game.farm.controller;

import com.rshb.game.farm.auth.AuthenticationResponse;
import com.rshb.game.farm.auth.AuthenticationService;
import com.rshb.game.farm.model.InventoryItem;
import com.rshb.game.farm.model.User;
import com.rshb.game.farm.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.rshb.game.farm.util.URLConstant.API;
import static com.rshb.game.farm.util.URLConstant.V1;

@RestController
@RequiredArgsConstructor
@RequestMapping(API + V1 + "/inventory")
public class InventoryController {

    private final AuthenticationService authenticationService;

    private final InventoryService inventoryService;


    @GetMapping
    public ResponseEntity<List<InventoryItem>> getInventory() {
        var principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return ResponseEntity.ok(inventoryService.findByFarm(principal.getFarm()));
    }
}
