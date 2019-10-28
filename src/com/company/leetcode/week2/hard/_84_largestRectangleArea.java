package com.company.leetcode.week2.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * created by benyafang on 2019/10.22 8:43
 * 分治法
 * */
public class _84_largestRectangleArea {

    //超出时间限制
    public static int largestRectangleArea(int[] heights) {
        int maxarea = 0;
        for(int i = 0;i < heights.length;i++){
            maxarea = Math.max(maxarea,heights[i]);
            for(int j = i + 1;j < heights.length;j++){//j遍历i后面的元素
                int minHeight = Integer.MAX_VALUE;
                for(int k = i;k <= j;k++){//k遍历i,j中间的元素，找到中间最小的元素
                    minHeight = Math.min(minHeight,heights[k]);
                }
                maxarea = Math.max(maxarea,minHeight *(j - i +1));
            }
        }
        return maxarea;

    }

    public static int largestRectangleArea1(int[] heights) {
        int maxarea = 0;
        for(int i = 0;i < heights.length;i++){
            int minHeight = heights[i];
            maxarea = Math.max(maxarea,minHeight);
            for(int j = i + 1;j < heights.length;j++){//j遍历i后面的元素
                minHeight = Math.min(minHeight,heights[j]);//minHeight表示的是对于同一个i，上一个j对应的最小高度
                maxarea = Math.max(maxarea,minHeight *(j - i +1));
            }
        }
        return maxarea;

    }

    public static int calculateArea(int[] heights,int start,int end){
        if(start >end)return 0;
        int minindex = start;
        for(int i = start; i <= end;i++){
            if(heights[minindex] > heights[i])minindex = i;
        }
        return Math.max(heights[minindex] * (end - start + 1), Math.max(calculateArea(heights,start,minindex - 1),calculateArea(heights,minindex + 1,end)));
    }

    public static int largestRectangleArea2(int[] heights) {
        return calculateArea(heights,0,heights.length - 1);

    }
    public static void main(String[] args){
        int[] heights = {2,1,5,6,2,3};
        int result = largestRectangleArea2(heights);
        System.out.println(result);
    }
}
