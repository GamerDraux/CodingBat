package com.company.Warmup2;

public class StringX {
    public static String stringX(String str) {
        StringBuilder modified = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            if (i==0||i==str.length()-1||(!(str.charAt(i)=='x'))){
                modified.append(str.charAt(i));
            }
        }
        return modified.toString();
    }

}
