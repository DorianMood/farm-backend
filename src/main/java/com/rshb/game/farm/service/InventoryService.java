package com.rshb.game.farm.service;

import com.rshb.game.farm.model.Farm;
import com.rshb.game.farm.model.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface InventoryService extends JpaRepository<InventoryItem, UUID> {
    List<InventoryItem> findByFarm(Farm farm);
}
