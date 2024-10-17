package com.rshb.game.farm.mapper;

import com.rshb.game.farm.api.resp.BedsResp;
import com.rshb.game.farm.api.resp.SeedResp;
import com.rshb.game.farm.model.Bed;
import org.mapstruct.BeanMapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {

    /*@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL)
    SeedResp getSeedRespFromSeed(Seed seed);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL)
    BedsResp getBedsRespFromBed(Bed bed);

    List<BedsResp> getListBedsRespFromBedList(List<Bed> bed);*/
}
