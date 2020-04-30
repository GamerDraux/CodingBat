package com.company.Warmup1;

public class NotString {
    public String notString(String str) {
        if (str.length()>2){
            if (str.substring(0,3).equals("not")){return str;}
        }
        return ("not "+str);
    }
}
