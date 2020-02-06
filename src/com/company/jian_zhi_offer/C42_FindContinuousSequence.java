package com.company.jian_zhi_offer;

import java.util.ArrayList;
public class C42_FindContinuousSequence {
    //1,  2,3,4   4,5  9
    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        if (sum <= 1) return new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int start = 1;
        while (start <= sum / 2) {
            int count = start; // 连续的和
            int end = start + 1; // 遍历后面的数字
            while (count < sum) {
                count += end; // 遍历相加
                end ++;
            }
            //count == sum
            if (count == sum) {
                ArrayList<Integer> tmp = new ArrayList<>();
                for (int i = start; i < end; i++) {
                    tmp.add(i);
                }
                result.add(tmp);
                start ++;
            } else if (count > sum ) {
                start ++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > s = FindContinuousSequence(9);
        System.out.println(s);
    }
}