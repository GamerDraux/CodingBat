package com.company.Warmup1;

public class EveryNth {
    public static String everyNth(String str, int n) {
        StringBuilder nthChar= new StringBuilder();
        for (int i=0; i<str.length(); i=i+n){
            nthChar.append(str.charAt(i));
        }
        return nthChar.toString();

    }

}
