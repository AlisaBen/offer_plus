package com.company.leetcode.week2.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * created by benyafang on 2019/10.22 8:43
 * */
public class _84_largestRectangleArea {

    public static int largestRectangleArea(int[] heights) {
        int res = 0;
        int existNum = 0;//计算在矩形内部的面积
        Map<Integer,ArrayList> map = new HashMap<>();


        for(int i = 0;i < heights.length;i++){
            res = heights[i];
            for(int j = i + 1;j < heights.length;j++){

            }
        }
        return 0;

    }
}
