package com.rshb.game.farm.api.resp;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class UserResp {

    private UUID id;
    private String username;
    private Integer balance;
    private LocalDateTime createdAt;

}
