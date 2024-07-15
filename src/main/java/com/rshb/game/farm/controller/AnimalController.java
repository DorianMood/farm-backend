package com.rshb.game.farm.controller;

import com.rshb.game.farm.model.animal.Animal;
import com.rshb.game.farm.service.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.rshb.game.farm.util.URLConstant.API;
import static com.rshb.game.farm.util.URLConstant.V1;

@RestController
@RequiredArgsConstructor
@RequestMapping((API + V1 + "/animal"))

public class AnimalController {

    private final AnimalRepository animalRepository;

    @GetMapping
    public String getAnimal() {

        return "HI ANIMAL";
    }
}
