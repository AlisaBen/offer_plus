package com.company.leetcode.week2.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * created by benyafang on 2019/10.22 8:43
 * */
public class _84_largestRectangleArea {

    public static int largestRectangleArea(int[] heights) {
        int res = 0;//结果
        int width = 1;

        int existNum = 0;//计算在矩形内部的面积
        Map<Integer,ArrayList> map = new HashMap<>();


        for(int i = 0;i < heights.length;i++){
            int tmp = heights[i];
            int min = heights[i];//选定数组中的最小值
            int len = 1;//选定数组的长度

            for(int j = i + 1;j < heights.length;j++){
                if(heights[j] >= min){//面积是由前面的最小值限定的
                    tmp = tmp + min * width;
                    len += 1;
                }else {//当前是最小值，需要判断加上该值之后的面积与之前的面积比较


                }
            }
        }
        return 0;

    }
}
