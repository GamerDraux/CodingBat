package com.company.Warmup1;

public class StringE {
    public static boolean stringE(String str) {
        return (str.length() - str.replaceAll("e", "").length()) >=1&& (str.length() - str.replaceAll("e", "").length()) <=3;
    }

}
