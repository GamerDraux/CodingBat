package com.company.Warmup2;

public class FrontTimes {
    public static String frontTimes(String str, int n) {
        String front;
        if (str.length()<3){front= str;} else {front = str.substring(0,3);}
        return front.repeat(Math.max(0, n));
    }

}
