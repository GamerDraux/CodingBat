package com.company.Warmup1;

public class DelDel {
    public static String delDel(String str) {
        if (str.length()>=4){
            if (str.startsWith("del", 1)){return str.substring(0,1)+str.substring(4);}
        }
        return str;
    }

}
