package com.company.java.door._1_basic;

import java.util.ArrayList;

/**
 * created by benyafang on 2019/10/30
 * 泛型
 * */
public class Test1 {
    //注意：Number并没有实现Comparable
    private static <T extends Number & Comparable<? super T>> T min(T[] values) {
        if (values == null || values.length == 0) return null;
        T min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min.compareTo(values[i]) > 0) min = values[i];
        }
        return min;
    }

    private static <T> void print(T[] valus){
        for(T i:valus){
            System.out.println(i);
        }
    }

    public static void main(String[] s){
        int a = min(new Integer[]{2,3,5,1});
        System.out.println(a);
        print(new Integer[]{2,3,5,1});
        print(new String[]{"fa","rt"});
    }
}
