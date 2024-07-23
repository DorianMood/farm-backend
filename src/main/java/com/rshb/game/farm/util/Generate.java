package com.rshb.game.farm.util;

import com.rshb.game.farm.model.Bed;
import com.rshb.game.farm.model.Corral;
import com.rshb.game.farm.model.User;

import java.util.ArrayList;
import java.util.List;

public class Generate {

    public static List<Bed> generateBed(Integer count, User user){

        List<Bed> resultList = new ArrayList<>();

        while (count > 0){
            resultList.add(Bed.builder().user(user).build());
            count--;
        }

        return resultList;
    }

    public static List<Corral> generateCorral(Integer count, User user){

        List<Corral> resultList = new ArrayList<>();

        while (count > 0){
            resultList.add(Corral.builder().user(user).build());
            count--;
        }

        return resultList;
    }
}
