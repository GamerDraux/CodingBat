package com.company.Warmup1;

public class Front3 {
    public static String front3(String str) {
        String repeater;
        if (str.length()>=3){repeater = str.substring(0,3);}
        else {repeater = str;}
        return repeater+repeater+repeater;
    }

}
