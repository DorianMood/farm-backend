package com.rshb.game.farm.service;

import com.rshb.game.farm.model.Barns;
import com.rshb.game.farm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BarnsRepository extends JpaRepository<Barns, UUID> {


}
