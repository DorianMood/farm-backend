package com.rshb.game.farm.api.resp;

import com.rshb.game.farm.model.seed.SeedKind;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class SeedResp {

    private UUID id;
    private String name;
    private String description;
    private SeedKind seedKind;
    private LocalDateTime landingTime;
    private Integer growthTime;
    private Integer profit;
}
