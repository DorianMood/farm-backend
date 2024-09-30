package com.rshb.game.farm.controller;

import com.rshb.game.farm.model.Corral;
import com.rshb.game.farm.model.FarmInventory;
import com.rshb.game.farm.model.User;
import com.rshb.game.farm.model.animal.Animal;
import com.rshb.game.farm.model.animal.AnimalKind;
import com.rshb.game.farm.service.AnimalRepository;
import com.rshb.game.farm.service.CorralRepository;
import com.rshb.game.farm.service.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.rshb.game.farm.util.URLConstant.API;
import static com.rshb.game.farm.util.URLConstant.V1;

@RestController
@RequiredArgsConstructor
@RequestMapping((API + V1 + "/animal"))
public class AnimalController {

    @GetMapping
    public String getAnimal() {

        return "HI ANIMAL";
    }
}
