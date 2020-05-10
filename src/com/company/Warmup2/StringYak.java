package com.company.Warmup2;

public class StringYak {

    public static String stringYak(String str) {
        String matching ="y.k";
        return str.replaceAll(matching,"");
    }
}
