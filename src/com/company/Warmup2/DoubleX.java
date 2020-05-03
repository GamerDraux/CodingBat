package com.company.Warmup2;

public class DoubleX {
    public static boolean  doubleX(String str) {
        for (int i = 0; i<str.length()-1;i++){
            if (str.startsWith("x", i)){
                return str.substring(i + 1, i + 2).equals("x");
            }
        }
        return false;
    }

}
