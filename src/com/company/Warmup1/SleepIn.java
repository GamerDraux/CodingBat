package com.company.Warmup1;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && !vacation) {
            return false;
        } else if (!weekday && !vacation) {
            return true;
        } else if (!weekday) {
            return true;
        }
        return true;
    }
}