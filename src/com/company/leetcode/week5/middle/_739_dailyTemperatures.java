package com.company.leetcode.week5.middle;

import java.util.Arrays;

public class _739_dailyTemperatures {
    public static int[] dailyTemperatures(int[] T) {
        for(int i = 0; i < T.length;i++){
            int day = 0;
            for(int j = i + 1;j < T.length;j++){
                if(T[j] > T[i]){
                    day = j - i;
                    break;
                }
            }
            T[i] = day;
        }
        return T;
    }
    /**
     * 方法二：空间换时间，从后向前遍历，保证数组中存储的数据的索引都在当前遍历元素的后面
     * */
    public static int[] dailyTemperatures1(int[] T) {
        int[] next = new int[101];//填充next数组为最大值
        Arrays.fill(next,Integer.MAX_VALUE);
        //原数组中的数值范围固定在30-100度
        int[] ans = new int[T.length];
        for(int i = T.length - 1;i >= 0;--i){
            int warmer_index = Integer.MAX_VALUE;
            for(int temperature = T[i] + 1;temperature <= 100;temperature++){
                if(next[temperature] < warmer_index){//要找到大于这个温度的最小索引
                    warmer_index = next[temperature];
                }
            }
            if(warmer_index < Integer.MAX_VALUE){//说明找到了这个元素，更新结果列表
                ans[i] = warmer_index - i;
            }

            next[T[i]] = i;//next数组中保证出现过的数值的位置存储对应的最小的索引
        }

        return ans;
    }

    public static void main(String[] args){
        int[] result = dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        System.out.println(Arrays.toString(result));
    }
}
