package com.company.jian_zhi_offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * */
public class C10_ReOrderArray {
    public static int[] reOrderArray1(int [] array) {
        int [] res = new int[array.length];
        int p = 0;
        int q = array.length - 1;
        for(int i = 0; i < array.length;i++){
            if(array[i] % 2 == 0){
                res[q] = array[i];
                q--;
            }else{
                res[p] = array[i];
                p++;
            }
        }
        int tmp;
        q = array.length - 1;
        while (p < q){
            tmp = res[p];
            res[p] = res[q];
            res[q] = tmp;
            p ++;
            q --;
        }
        return res;
    }

    public static void reOrderArray(int [] array) {
        List<Integer> tmp = new ArrayList<Integer>();
        int p = 0;
        for(int i = 0;i < array.length ;i++){
            if(array[i] % 2 == 1){
                array[p] = array[i];
                p++;
            }else{
                tmp.add(array[i]);
            }
        }
        for(int i = 0; i < tmp.size();i++){
            array[p] = tmp.get(i);
            p ++;
        }
        for(int i = 0; i <array.length;i++){
            System.out.println(array[i]);
        }
    }
     public static void main(String[] args){
        reOrderArray(new int[]{3,5,6,8,4,5,2,3});
     }
}
