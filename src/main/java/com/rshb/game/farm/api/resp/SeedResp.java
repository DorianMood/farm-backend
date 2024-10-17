package com.rshb.game.farm.api.resp;

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
    private LocalDateTime landingTime;
    private Integer growthTime;
    private Integer profit;
}
