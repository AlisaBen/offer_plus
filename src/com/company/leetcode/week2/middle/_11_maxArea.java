package com.company.leetcode.week2.middle;

public class _11_maxArea {
    public static int maxArea(int[] height) {
        int result = 0;
        for(int i = 0;i < height.length - 1;i ++){
            int tmp = 0;
            for(int j = i+1;j < height.length;j++){
                tmp = Math.max(tmp,Math.min(height[i],height[j]) * (j - i));
            }
            result = Math.max(result,tmp);
        }
        return result;
    }
    public static int maxArea1(int[] height) {
        int result = 0;
        for(int i = 0,j = height.length - 1;i < j;){
            result = Math.max(result,Math.min(height[i],height[j]) * (j-i));
            if(height[i] < height[j])i++;
            else j--;
        }
        return result;
    }
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
//        int result = maxArea(height);
        int result = maxArea1(height);

        System.out.println(result);
    }
}
