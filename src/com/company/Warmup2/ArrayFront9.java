package com.company.Warmup2;

public class ArrayFront9 {
    public static boolean arrayFront9(int[] nums) {
        int first = 4;
        if (nums.length<4){
            first = nums.length;
        }
        for (int i = 0; i<first; i++){
            if (nums[i] == 9){
                return true;
            }
        }
        return false;
    }

}
