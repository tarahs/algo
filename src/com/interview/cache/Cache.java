package com.interview.cache;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    static Map<Integer, Integer> map = new HashMap<>();


    public Map<Integer, Integer> getConfig(){

        for (int i=0;i<1000;i++){
            map.put(i,i);
        }
        return map;
    }
}
