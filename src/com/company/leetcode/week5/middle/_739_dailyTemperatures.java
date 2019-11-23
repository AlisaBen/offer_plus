package com.company.leetcode.week5.middle;

import java.util.Arrays;
import java.util.Stack;

/**
 * 每日温度
 * */
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

    /**
     * 方法三：栈
     * 从后向前遍历
     * 栈中存储有序序列，栈顶元素最大，存储对应的原数组中的索引
     * 每次遍历一个元素，判断栈中是否有比该元素大的
     * 如果没有，将栈清空，将该元素入栈（这是因为再向前遍历的时候，该元素肯定会截断后面的元素判断--因为该元素比后面的元素都大）
     * 如果有比该元素大的元素，计算索引差值，并将该元素入栈到相应的位置
     * */
    public static int[] dailyTemperatures2(int[] T) {
        Stack<Integer> s = new Stack<>();//栈中存储索引值，对应的栈顶的元素最大,即栈顶元素距离正在遍历的元素最远
        int[] ans = new int[T.length];
        for(int i = T.length - 1;i >= 0;--i){
            while (!s.empty() && T[i] >= T[s.peek()])s.pop();//栈不空，栈顶索引对应的元素小于等于当前元素，出栈
            ans[i] = s.empty()? 0 : s.peek() - i;
            s.push(i);
        }
        return ans;
    }

    public static void main(String[] args){
        int[] result = dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        System.out.println(Arrays.toString(result));
    }
}
