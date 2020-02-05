package com.company.jian_zhi_offer;

public class C28_MoreThanHalfNum_Solution {
    public static int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length == 0) return 0;
        int count = 1;
        int result = array[0];
        for (int i = 1;i < array.length;i++) {
            if (count == 0) {
                result = array[i];
                count = 1;
            } else {
                if (result == array[i]) {
                    count ++;
                } else count --;
            }
        }
        return isMoreThanHalf(array,result) ? result: 0;
    }
    public static boolean isMoreThanHalf(int[] array, int result) {
        int count = 0;
        for(int i : array) {
            if(i == result) count ++;
        }
        return count > array.length / 2;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2,5,2,3};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
}