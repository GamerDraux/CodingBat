package com.company.Warmup1;

public class Max1020 {
    public static int max1020(int a, int b) {
        if (Math.max(a,b)>=10&&Math.max(a,b)<=20){return Math.max(a,b);}
        if (Math.min(a,b)>=10&&Math.min(a,b)<=20){return Math.min(a,b);}
        return 0;
    }

}
