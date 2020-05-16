package com.company.map1;

import java.util.Map;

public class Topping3 {
    public static Map<String, String> topping3(Map<String,
            String> map) {
        System.out.println("Original Map: "+map);
        if (map.containsKey("potato")){
            if (!map.get("potato").equals("")){
                map.put("fries", map.get("potato"));
            }
        }
        if (map.containsKey("salad")){
            if (!map.get("salad").equals("")){
                map.put("spinach", map.get("salad"));
            }
        }
        return map;
    }

}
