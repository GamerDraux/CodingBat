package com.company.map1;

import java.util.Map;

public class Topping2 {
    public static Map<String, String> topping2(Map<String,
            String> map) {
        System.out.println("Original Map: "+map);
        if (map.containsKey("ice cream")){
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")){
            map.put("spinach", "nuts");
        }
        return map;
    }

}
