package com.company.Warmup2;

public class AltPairs {
    public static String altPairs(String str) {
        StringBuilder modified= new StringBuilder();
        for (int i = 0; i<str.length(); i++){
            if ((i/2)%2==0){
                modified.append(str, i, i + 1);
            }
        }
        return modified.toString();
    }

}
