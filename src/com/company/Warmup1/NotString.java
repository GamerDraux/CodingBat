package com.company.Warmup1;

public class NotString {
    public static String notString(String str) {
        if (str.length()>2){
            if (str.startsWith("not")){return str;}
        }
        return ("not "+str);
    }
}
