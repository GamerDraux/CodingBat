package com.company.Warmup1;

public class Close10 {
    public static int close10(int a, int b) {
        if (Math.abs(a-10)!=Math.abs(b-10)){
            return Math.abs(a-10)<Math.abs(b-10)? a :  b;
        }
        return 0;
    }

}
