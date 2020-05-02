package com.company.Warmup1;

public class FrontBack {
    public String frontBack(String str) {
        if (str.length()<=1){return str;}
        String front = str.substring(0,1);
        String back = str.substring(str.length()-1);
        if (str.length()==2){return back+front;}
        else {return back+str.substring(1,str.length()-1)+front;}
    }

}
