package com.rshb.game.farm.service;

import com.rshb.game.farm.model.ShopItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShopRepository extends JpaRepository<ShopItem, UUID> {
}
