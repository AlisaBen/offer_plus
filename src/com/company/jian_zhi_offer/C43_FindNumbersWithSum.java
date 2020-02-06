package com.company.jian_zhi_offer;

import java.util.ArrayList;
import java.util.Arrays;
public class C43_FindNumbersWithSum {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        if (array == null || array.length <= 1) return new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int len = array.length;
        int start = 0;
        int end = len - 1;
        while (start < end) {
            if (array[start] + array[end] == sum) {
                if (result.size() == 0)result.addAll(Arrays.asList(array[start],array[end]));
                else {
                    if (result.get(0) * result.get(1) > array[start] * array[end]) {
                        result.clear();
                        result.addAll(Arrays.asList(array[start],array[end]));
                        
                    }
                }
                start ++;
                end --;
            } else if (array[start] + array[end] < sum) {
                start ++;
            } else end --;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a= {1,2,4,7,11,15};
        ArrayList<Integer> res = FindNumbersWithSum(a, 15);
        System.out.println(res);
    }
}

