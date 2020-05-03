package com.company.Warmup2;

public class StringSplosion {
    public static String stringSplosion(String str) {
        StringBuilder sploded = new StringBuilder();
        for (int i=0; i<str.length()+1; i++){
            sploded.append(str, 0, i);}
        return sploded.toString();
    }

}
