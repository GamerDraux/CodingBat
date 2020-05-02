package com.company.Warmup1;

public class Main {

    public static void main(String[] args) {
	SleepIn nappy = new SleepIn();
	System.out.println(nappy.sleepIn(true,false));
    MonkeySmile trouble = new MonkeySmile();
    System.out.println(trouble.monkeyTrouble(true,false));
    SumDouble dubs = new SumDouble();
    System.out.println((dubs.sumDouble(2,2)));
    Diff21 diff = new Diff21();
    System.out.println(diff.diff21(22));
    ParrotTrouble talking = new ParrotTrouble();
    System.out.println(talking.parrotTrouble(true, 23));
    Makes10 ten = new Makes10();
    System.out.println((ten.makes10(9,1)));
    NearHundred near = new NearHundred();
    System.out.println(near.nearHundred(207));
    PosNeg posNeg = new PosNeg();
    System.out.println(posNeg.posNeg(-1, 2, true));
    NotString not = new NotString();
    System.out.println(not.notString("not is not"));
    MissingChar miss = new MissingChar();
    System.out.println(miss.missingChar("kitten", 4));
    FrontBack fb = new FrontBack();
    System.out.println(fb.frontBack("eodc"));

    }
}
