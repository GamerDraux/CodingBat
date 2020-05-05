package com.company.Warmup2;

public class StringMatch {
    public static int stringMatch(String a, String b){
        String shorter;
        String longer;
        int counter=0;
        if (a.length()<b.length()){
            shorter = a;
            longer = b;
        } else {
            shorter = b;
            longer = a;
        }
        for (int i=0; i<shorter.length()-1; i++){
            if (shorter.substring(i,i+2).equals(longer.substring(i,i+2))){counter ++;}
        }
        return counter;
    }
}
