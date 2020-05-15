package com.company.map1;

import java.util.Map;

public class MapShare {
    public static Map<String, String> mapShare(Map<String,
            String> map) {
        System.out.println("Original Map: "+map);
        if (map.containsKey("a")&&!map.get("a").equals("")){
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

}
