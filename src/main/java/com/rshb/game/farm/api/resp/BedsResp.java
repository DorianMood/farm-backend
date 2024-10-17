package com.rshb.game.farm.api.resp;


import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class BedsResp {

    private UUID id;
    private SeedResp seed;

}
