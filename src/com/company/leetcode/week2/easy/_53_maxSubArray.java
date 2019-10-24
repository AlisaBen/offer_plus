package com.company.leetcode.week2.easy;

import java.util.Arrays;

public class _53_maxSubArray {
    public static int[] getMaxArray(int[] nums,int start,int end){
        int min = nums[start];
        int min_index = start;
        int sum = 0;
        for(int i = start; i < end;i ++){
            sum += nums[i];
            if(nums[i] < min){
                System.out.println("numsi:" + nums[i] + " min :" + min);
                min_index = i;
                min = nums[i];
            }
        }
        return new int[]{sum,min_index};
    }
    public static int maxSubArray1(int[] nums,int start,int end){
//        if(end - start < 1) {
////            System.out.println("----------");
////            System.out.println("sub array:" + Arrays.toString(nums) + " start:" + start + " end:" + end);
////            System.out.println("sub array:" + Arrays.toString(nums) + " start:" + start + " end:" + end + " sum:"+ nums[start]);
//
//            return 0;
//        }
        if(end - start == 1){
            System.out.println("sub array:" + Arrays.toString(nums) + " start:" + start + " end:" + end + " sum:"+ nums[start]);
            return nums[start];
        }
//        System.out.println("start:"+start + "end：" + end);
        int[] result = getMaxArray(nums,start,end);
        int sum = result[0];
        int min_index = result[1];
        if(min_index > start && min_index < end){
            int left_result = maxSubArray1(nums,start,min_index);
            if(end > min_index + 1){
                int right_result = maxSubArray1(nums,min_index + 1,end);
                System.out.println("sub array:" + Arrays.toString(nums) + " start:" + start + " min:" + min_index + " end:" + end + " left:" + left_result + " right:" + right_result + " sum:"+ Math.max(sum,Math.max(left_result,right_result)));
                return Math.max(sum,Math.max(left_result,right_result));
            }else{
                System.out.println("sub array:" + Arrays.toString(nums) + " start:" + start + " min:" + min_index + " end:" + end + " left:" + left_result + " sum:"+ Math.max(sum,left_result));
                return Math.max(sum,left_result);
            }


        }else if(min_index > start){
            int left_result = maxSubArray1(nums,start,min_index);
//            int right_result = maxSubArray1(nums,min_index + 1,end);
            System.out.println("sub array:" + Arrays.toString(nums) + " start:" + start + " min:" + min_index + " end:" + end + " left:" + left_result  + " sum:"+ Math.max(sum,left_result));
            return Math.max(sum,left_result);
        }else if(min_index < end){
//            int left_result = maxSubArray1(nums,start,min_index);
            int right_result = maxSubArray1(nums,min_index + 1,end);
            System.out.println("sub array:" + Arrays.toString(nums) + " start:" + start + " min:" + min_index + " end:" + end + " right:" + right_result + " sum:"+ Math.max(sum,right_result));
            return Math.max(sum,right_result);
        }else{
            return sum;
        }

    }
    public static int maxSubArray(int[] nums) {
        return maxSubArray1(nums,0,nums.length);
    }
    public static int maxSubArra3(int[] nums) {
        int result = nums[0];
        int sum = 0;
        for(int i : nums){
            if(sum > 0)sum += i;
            else sum = i;
            result = Math.max(result,sum);
        }
        return result;

    }
    public static void main(String[] args){
        int[] input = {-2,1,-3,4,-1,2,1,-5};
//        int[] input = {8,-19,5,-4,20};
//        int[] input = {31,-41,59,26,-53,58,97,-93,-23,84};
        int result = maxSubArra3(input);
//        int result = maxSubArray(new int[]{8,-19,5,-4,20});
//        int [] result = getMaxArray(input,0,input.length);
//        System.out.println(Arrays.toString(result));
        System.out.println(result);
    }
}
