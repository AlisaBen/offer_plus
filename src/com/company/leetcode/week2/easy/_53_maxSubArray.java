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
            if(sum + i > i )
//            if(sum > 0)
                sum += i;
            else sum = i;
            result = Math.max(result,sum);//result一直存储当前的最大子序和
        }
        return result;

    }
    /**
     * https://leetcode-cn.com/problems/maximum-subarray/solution/xiang-xi-jie-du-dong-tai-gui-hua-de-shi-xian-yi-li/
     * */
    public static int maxSubArray4(int[] nums) {
        // Kadane算法扫描一次整个数列的所有数值，
// 在每一个扫描点计算以该点数值为结束点的子数列的最大和（正数和）。
// 该子数列由两部分组成：以前一个位置为结束点的最大子数列、该位置的数值。
// 因为该算法用到了“最佳子结构”（以每个位置为终点的最大子数列都是基于其前一位置的最大子数列计算得出,
// 该算法可看成动态规划的一个例子。
// 状态转移方程：sum[i] = max{sum[i-1]+a[i],a[i]}
// 其中(sum[i]记录以a[i]为子序列末端的最大序子列连续和)
        // 在每一个扫描点计算以该点数值为结束点的子数列的最大和（正数和）。
        int max_ending_here = nums[0];
        int max_so_far = nums[0];

        for (int i = 1; i < nums.length; i ++ ) {
            // 以每个位置为终点的最大子数列 都是基于其前一位置的最大子数列计算得出,

            max_ending_here = Math.max ( nums[i], max_ending_here + nums[i]);
            max_so_far = Math.max ( max_so_far, max_ending_here);
        };

        return max_so_far;
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
