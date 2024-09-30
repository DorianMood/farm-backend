package com.rshb.game.farm.service;

import com.rshb.game.farm.model.Bed;
import com.rshb.game.farm.model.User;
import com.rshb.game.farm.model.animal.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BedRepository extends JpaRepository<Bed, UUID> {

    List<Bed> findByUser(User user);
}
