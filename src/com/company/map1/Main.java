package com.company.map1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> mapBully = new HashMap<>();
        mapBully.put("a", "candy");
        mapBully.put("b", "dirt");
        System.out.println(MapBully.mapBully(mapBully));
        Map<String, String> mapShare = new HashMap<>();
        mapShare.put("a", "aaa");
        mapShare.put("b", "bbb");
        mapShare.put("c", "ccc");
        System.out.println(MapShare.mapShare(mapShare));
        Map<String, String> amapAB = Map.of("a", "Hi", "b"
                ,"There");
        Map<String,String> mapAB= new HashMap<>(amapAB);
        System.out.println(MapAB.mapAB(mapAB));
        Map<String, String> aTopping1 = Map.of("ice " +
                "cream", "peanuts","pancake", "syrup");
        Map<String, String> topping1=
                new HashMap<>(aTopping1);
        System.out.println(Topping1.topping1(topping1));
    }
}
