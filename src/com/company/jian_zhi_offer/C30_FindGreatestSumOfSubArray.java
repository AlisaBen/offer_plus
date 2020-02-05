package com.company.jian_zhi_offer;

public class C30_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) return Integer.MIN_VALUE;
        int preSum = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;
        for (int i : array) {
            if (sum < 0) sum = i;
            else {
                sum += i;
            }
            if (sum > preSum) preSum = sum;
        }
        return preSum;
        
    }
}
