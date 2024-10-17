package com.rshb.game.farm.util;

import com.rshb.game.farm.model.Bed;
import com.rshb.game.farm.model.Barns;
import com.rshb.game.farm.model.Farm;

import java.util.ArrayList;
import java.util.List;

public class Generate {

    public static List<Bed> generateBed(Integer count, Farm farm) {

        List<Bed> resultList = new ArrayList<>();

        while (count > 0) {
            resultList.add(Bed.builder().farm(farm).build());
            count--;
        }

        return resultList;
    }

    public static List<Barns> generateBarns(Integer count, Farm farm) {

        List<Barns> resultList = new ArrayList<>();

        while (count > 0) {
            resultList.add(Barns.builder().farm(farm).build());
            count--;
        }

        return resultList;
    }
}
