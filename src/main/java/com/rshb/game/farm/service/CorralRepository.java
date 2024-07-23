package com.rshb.game.farm.service;

import com.rshb.game.farm.model.Corral;
import com.rshb.game.farm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CorralRepository extends JpaRepository<Corral, UUID> {


    List<Corral> findByUser(User user);
}
