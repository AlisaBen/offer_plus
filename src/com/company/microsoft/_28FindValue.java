package com.company.microsoft;

/***\
 * 一个数组是由一个递减数列左移若干位形成的，比如{4，3，2，1，6，5}是由{6，5，4，3，2，1}左移两位形成的，在这种数组中查找某一个数。
 */
class _28FindValue {

    public static int findValue(int[] array, int value) {
        if (array.length == 0) return -1;
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) >> 1;
            if (array[middle] == value) return middle;
            if (array[middle] <= array[start]) {
                // start - middle是单调递减的
                if (value <= array[start] && value > array[middle]) {
                    // value在start-middle之间
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                // middle > start
                // 最小值在start-middle之间, middle-end之间单调递减
                if (array[middle] > value && array[end] <= value) {
                    start = middle + 1;
                } else end = middle - 1;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = new int[] {4,3,2,1,6,5};
        int index = findValue(array, 9);
        System.out.println(index);
    }

    
}