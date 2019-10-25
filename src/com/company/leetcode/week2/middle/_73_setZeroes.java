package com.company.leetcode.week2.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _73_setZeroes {
    public static void setZeroes(int[][] matrix) {
        List<Integer> row_index = new ArrayList<>();
        List<Integer> column_index = new ArrayList<>();
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row_index.add(i);
                    column_index.add(j);
                }
            }
        }
        for(int i = 0;i < row_index.size();i++){
            for(int j = 0; j < matrix[0].length;j++){
                matrix[row_index.get(i)][j] = 0;
            }
            for(int k = 0;k < matrix.length;k ++ ){
                matrix[k][column_index.get(i)] = 0;
            }
        }
    }
    public static void main(String [] args){
//        int [][] input = {{1,1,1},{1,0,1},{1,1,1}};
        int [][] input = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(input);
        for(int i = 0; i < input.length;i++){
            System.out.println(Arrays.toString(input[i]));
        }

    }
}
