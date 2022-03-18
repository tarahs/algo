package com.interview.immutable;

import java.util.HashMap;
import java.util.Map;

public final class Immutable {
    private String name;
    private final Map<String, Integer> map;

    public Immutable(String name, Map<String, Integer> map1) {
        this.name = name;
        map = new HashMap<>();
        for(Map.Entry<String, Integer> entry : map1.entrySet()){
            map.put(entry.getKey(), entry.getValue());
        }

    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getMap() {
        return (Map<String,Integer>)((HashMap<String, Integer>)map).clone();
    }
}


