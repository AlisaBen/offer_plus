package com.company.jian_zhi_offer.array;

import java.util.ArrayList;
import java.util.concurrent.TransferQueue;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，
 * 如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * 惊！居然还不会java初始化数组
 * java 的false和true都是小写字母开头
 * 没有考虑到奇数矩阵最后一个元素的打印
 * 没有考虑到非正方形矩阵
 * 没有考虑到单排的情况下，重复遍历同行或者同列
 * */
public class C16_PrintMatrix {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
//        System.out.println(m);
//        System.out.println(n);
        ArrayList tmp = new ArrayList();
        /**
         * ArrayList的add用法
         * index,object，index只能是list目前已经存在的索引的范围，不能超
         * 在某个索引位置增加元素，后面的元素依次后移
         * */
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        int i,j;
        while (left <= right && top <= bottom){
//            System.out.println("top:"+top+"bottom:"+bottom+"left:"+left+"right:"+right);
            for(i = left;i < right;i++){
                tmp.add(matrix[top][i]);
            }
            for(j = top;j < bottom; j++){
                tmp.add(matrix[j][right]);
            }
            for(i = right;i > left;i--){
                if(top == bottom)break;
                tmp.add(matrix[bottom][i]);
            }
            for(j = bottom;j > top;j--){
                if(left == right)break;
                tmp.add(matrix[j][left]);
            }
            if(top == bottom && left == right && top == left){
                tmp.add(matrix[bottom][left]);
            }
            else if(top == bottom){
//                System.out.println("sss");
//                System.out.println("top:"+top+"bottom:"+bottom+"left:"+left+"right:"+right);
                tmp.add(matrix[bottom][i]);
            }
            else if(right == left){
                tmp.add(matrix[j][left]);
            }

            top++;
            bottom--;
            left++;
            right--;
        }
        return tmp;

    }

    public static void main(String[] args){
        int matrix[][] = new int[2][2];
        int matrix1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList res = printMatrix(matrix1);
        System.out.println(res);
    }
}
