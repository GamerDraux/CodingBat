package com.company.Warmup1;

public class Front22 {
    public static String front22(String str) {
        String front2;
        if (str.length()<2){front2=str;}
        else {front2 = str.substring(0,2);}
        return front2+str+front2;
    }

}
