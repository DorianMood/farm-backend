package com.rshb.game.farm.service;

import com.rshb.game.farm.model.animal.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AnimalRepository extends JpaRepository<Animal, UUID> {
}
