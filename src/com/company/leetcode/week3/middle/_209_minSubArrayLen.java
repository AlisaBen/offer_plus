package com.company.leetcode.week3.middle;

/**
 * created by Arya on 2019/11/5 22:17
 * 滑动窗口
 * */
public class _209_minSubArrayLen {
    public static int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int first = 0;//滑动窗口左侧索引
        int last = 0;//滑动窗口右侧索引
        int result = nums.length;//默认大于s的长度为数组长度
        boolean flag = false;
        while (last < nums.length){
            //循环的条件是滑动窗口的右侧索引小于数组长度
            if(sum + nums[last] < s){
                sum += nums[last++];//sum加上当前的数值，然后右侧索引++
            }else{//sum+nums[last] >= s
                flag = true;
                result = Math.min(result,last - first + 1);
                sum -= nums[first++];//因为下一次循环比较的时候仍然要比较sum+nums[last]的值所以这里的sum不进行加法
                //判断sum减去滑动窗口左侧的数值是否仍然满足条件
//                result = Math.min(result,last - first + 1);
            }

        }

        return flag ? result : 0;
    }
    public static void main(String[] args){
        int res = minSubArrayLen(7,new int[]{2,3,1,2,4,3});
        System.out.println(res);
    }
}
