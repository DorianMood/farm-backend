package com.rshb.game.farm.controller;

import com.rshb.game.farm.api.req.BedRequest;
import com.rshb.game.farm.api.resp.BedsResp;
import com.rshb.game.farm.model.User;
import com.rshb.game.farm.service.impl.BedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.rshb.game.farm.util.URLConstant.API;
import static com.rshb.game.farm.util.URLConstant.V1;

@RestController
@RequiredArgsConstructor
@RequestMapping((API + V1 + "/beds"))
public class BedsController {


    private final BedService bedService;


    @GetMapping
    public ResponseEntity<List<BedsResp>> getAllBeds() {
        var principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return ResponseEntity.ok(bedService.getAllBedsByUser(principal));
    }

    @PostMapping("/harvest")
    public ResponseEntity<BedsResp> getAllBeds(@RequestBody BedRequest bedId) {
        return null;
    }
}
