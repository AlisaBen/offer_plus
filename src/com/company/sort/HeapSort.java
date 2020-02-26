package com.company.sort;
import java.util.Arrays;

class HeapSort {
    static int len;

    public static int[] HeapSort(int[] array) {

        len = array.length;
        
        if (len < 1) return array;
        
        //1.构建一个最大堆
        
        buildMaxHeap(array);
        System.out.println("build over");
        
    //2.循环将堆首位（最大值）与末位交换，然后在重新调整最大堆
        
        while (len > 0) {
        
        swap(array, 0, len - 1);
        
        len--;
        
        adjustHeap(array, 0);
        
        }
        
        return array;
        
    }
    
    public static void buildMaxHeap(int[] array) {

        //从最后一个非叶子节点开始向上构造最大堆
        
        for (int i = (len/2 - 1); i >= 0; i--) { 
            //感谢 @让我发会呆 网友的提醒，此处应该为 i = (len/2 - 1)
            adjustHeap(array, i);
        }
    }
        
    public static void adjustHeap(int[] array, int i) {

        int maxIndex = i;
        
        //如果有左子树，且左子树大于父节点，则将最大指针指向左子树
        if (i * 2 + 1 < len && array[i * 2 + 1] > array[maxIndex]) {
            System.out.println(array[i * 2 + 1] + "left i : " + i);
            maxIndex = i * 2 + 1;
        }
            //如果有右子树，且右子树大于父节点，则将最大指针指向右子树
        if (i * 2 + 2 < len && array[i * 2 + 2] > array[maxIndex]) {
            System.out.println(array[i * 2 + 2] + " right i : " + i);
            maxIndex = i * 2 + 2;
        }
        //如果父节点不是最大值，则将父节点与最大值交换，并且递归调整与父节点交换的位置。
        if (maxIndex != i) {
            swap(array, maxIndex, i);
            adjustHeap(array, maxIndex);
        }
        System.out.println(Arrays.toString(array));
    }
    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void main(String[] args) {
        int[] array = new int[]{5,9,7,1,4,3,2};
        int[] res = HeapSort(array);
        System.out.println(Arrays.toString(res));

    }
            
    
}
