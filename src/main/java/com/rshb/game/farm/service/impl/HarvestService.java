package com.rshb.game.farm.service.impl;


import com.rshb.game.farm.model.Bed;
import com.rshb.game.farm.model.Corral;
import com.rshb.game.farm.model.FarmInventory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class HarvestService {

    Corral harvest(Corral seed) {
        return null;
    }

    Bed harvest(Bed bed) {
        if (isHarvest(bed)) {
            FarmInventory farmInventory = bed.getUser().getFarmInventory();
            farmInventory.setBalance(farmInventory.getBalance() + bed.getSeed().getProfit());
            bed.setSeed(null);
        }
        return bed;
    }

    public boolean isHarvest(Bed bed) {
        return LocalDateTime.now().isAfter(bed.getSeed().getLandingTime().plusMinutes(bed.getSeed().getGrowthTime()));
    }
}
