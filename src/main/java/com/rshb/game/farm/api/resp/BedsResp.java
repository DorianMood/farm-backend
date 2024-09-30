package com.rshb.game.farm.api.resp;


import com.rshb.game.farm.model.seed.Seed;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class BedsResp {

    private UUID id;
    private SeedResp seed;

}
