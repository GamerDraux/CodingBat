package com.company.Warmup1;

public class StartOz {
    public static String startOz(String str) {
        if (str.length()<2){
            if (str.equals("o")|| str.equals("z")){return str;}
            return "";
        }
        String ozCheck = str.substring(0,2);
        String oz ="";
        if (ozCheck.startsWith("o")){oz= oz+"o";}
        if (ozCheck.startsWith("z", 1)){oz= oz+"z";}
        return oz;
    }

}
