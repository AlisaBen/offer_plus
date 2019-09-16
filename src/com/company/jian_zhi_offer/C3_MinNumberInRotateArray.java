package com.company.jian_zhi_offer;

import java.lang.reflect.Array;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * */
public class C3_MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)return 0;
        else{
            int tmp = array[0];
            for(int idx = 1;idx < array.length;idx++){
                if(tmp > array[idx])tmp = array[idx];
            }
            return tmp;
        }

    }

    public static int minNumberInRotateArray1(int [] array) {
        if(array.length == 0)return 0;
        else{
            if(array.length == 1)return array[0];
            else{
                int tmp = 0;
                int idx1 = 0;
                int idx2 = array.length - 1;
                while(idx2 > idx1){
                    if(array[idx1] < array[idx2]){
                        tmp = array[idx1];
                        idx2--;
                    }else{
                        tmp = array[idx2];
                        idx1++;
                    }
                }
                return tmp;
                

            }

        }

    }
    public static void main(String[] args){
        System.out.println(minNumberInRotateArray1(new int[]{5,4,5,6,2}));
    }
}
