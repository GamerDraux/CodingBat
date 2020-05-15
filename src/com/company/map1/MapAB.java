package com.company.map1;

import java.util.Map;

public class MapAB {
    public static Map<String, String> mapAB(Map<String,
            String> map) {
        System.out.println("Original Map: "+map);
        if (map.containsKey("a")&&map.containsKey("b")){
            map.put("ab", map.get("a")+map.get("b"));
        }
        return map;

    }

}
