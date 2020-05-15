package com.company.map1;

import java.util.Map;

public class Topping1 {
    public static Map<String, String> topping1(Map<String,
            String> map) {
        System.out.println("Original Map: "+map);
        map.put("bread", "butter");
        if (map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        return map;
    }

}
