package com.company.leetcode.week3.middle;

public class _209_minSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        boolean flag = false;
        for(int i = 0;i < nums.length;i++){
            if(sum < s){
                sum += nums[i];
                if(sum >= s){
                    result = i + 1;
                    flag = true;
                }
            }else{
                if (sum - nums[i - result] + nums[i] >= s){
                    int j = i - result + 1;
                    sum = sum - nums[i - result] + nums[i];
                    while (j <= i && sum - nums[j] > s){
                        sum = sum - nums[j];
                        result--;
                    }
                }



            }


        }
        return 0;
    }
}
