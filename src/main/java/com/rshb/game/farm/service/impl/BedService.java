package com.rshb.game.farm.service.impl;

import com.rshb.game.farm.api.resp.BedsResp;
import com.rshb.game.farm.mapper.Mapper;
import com.rshb.game.farm.model.Bed;
import com.rshb.game.farm.model.User;
import com.rshb.game.farm.service.BedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BedService {

    private final Mapper mapper;

    private final BedRepository bedRepository;

    public List<BedsResp> getAllBedsByUser(User user) {
        return null;
    }


}
