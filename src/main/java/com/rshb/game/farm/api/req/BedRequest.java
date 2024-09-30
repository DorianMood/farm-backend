package com.rshb.game.farm.api.req;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.UUID;

@Builder
@Data
@Jacksonized
public class BedRequest {
    private UUID bedId;
}
