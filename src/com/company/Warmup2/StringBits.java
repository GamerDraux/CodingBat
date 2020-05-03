package com.company.Warmup2;

public class StringBits {
    public static String stringBits(String str) {
        StringBuilder bits= new StringBuilder();
        for (int i =0 ; i<str.length(); i+=2){
            bits.append(str, i, i + 1);}
        return bits.toString();
    }

}
