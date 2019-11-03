package com.company.leetcode.week2.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _48_rotate {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int rotate_num = n / 2;//一共旋转的圈数
        int num = 0;//旋转的第几圈
        while (rotate_num != 0){
            num++;
            int operate_num = n - 2 * (num - 1);//该圈一行或者一列操作的数据个数
            int index1 = num - 1;//第一行
            int index2 = n - 1 - (num - 1);//后面一行
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int i = index1;i < index2;i++){
                tmp.add(matrix[i][index2]);
                matrix[i][index2] = matrix[index1][i];
            }
            for(int j = index1 + 1;j <= index2;j++){
                int tmp1 = matrix[index2][j];
                matrix[index2][j] = tmp.get(operate_num - 1 - (j - (index1 + 1)) - 1);
                tmp.remove(operate_num - 1 - (j - (index1 + 1)) - 1);
                tmp.add(operate_num - 1 - (j - (index1 + 1)) - 1,tmp1);
            }
            for(int i = index1 + 1;i <= index2;i++){
                int tmp1 = matrix[i][index1];
                matrix[i][index1] = tmp.get(operate_num - 1 - (i - (index1 + 1)) - 1);
                tmp.remove(operate_num - 1 - (i - (index1 + 1)) - 1);
                tmp.add(operate_num - 1 - (i - (index1 + 1)) - 1,tmp1);
            }
            for(int j = index1;j < index2;j++){
                matrix[index1][j] = tmp.get(j - index1);
            }
            rotate_num--;
        }


    }
    public static void main(String[] args){
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(matrix);
        for(int i =0;i < matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
