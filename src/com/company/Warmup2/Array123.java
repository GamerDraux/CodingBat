package com.company.Warmup2;

import java.util.Arrays;

public class Array123 {
    public static boolean array123(int[] nums) {
        int[] check = {1,2,3};
        for (int i = 0; i<nums.length-2; i++){
            if (Arrays.equals(Arrays.copyOfRange(nums, i, i+3),(check))){
                return true;
            }
        }
        return false;
    }

}
