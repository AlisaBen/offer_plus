package com.company.microsoft;
import java.util.Arrays;
/**
 * 
 * 输入一个整数数组，调整数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。要求时间复杂度为O(n)。
 */
class _34Resort{
    public static int[] resort(int[] array) {
        if (array.length < 2) return array;
        int left = 0;
        int right = array.length - 1;
        int tmp = array[right];
        while(left < right) {
            while (left < right && array[left] % 2 == 1) left++;
            if (left < right )array[right] = array[left];
            while (left < right && array[right] % 2 == 0) right--;
            if (left < right) array[left] = array[right];
        }
        array[right] = tmp;

        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[] {2,3,4};
        int[] result = resort(array);
        System.out.println(Arrays.toString(result));
    }
}