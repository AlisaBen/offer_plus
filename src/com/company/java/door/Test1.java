package com.company.java.door;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * created by benyafang on 2019/10/21 8:58
 * */
public class Test1 {
    /*声明数组的方式，未设置初始值，应该设定数组的长度*/
    public static void test1(){
        String [] aArray = new String[5];
        String [] bArray = {"a","b"};
        String [] cArray = new String[]{"a","b"};
//        System.out.println(bArray.toString());
    }
    public static void test2(){
        StringBuilder sb1 = new StringBuilder();//创建空的字符串缓冲区，初始化16的数组长度
        StringBuilder sb2 = new StringBuilder(10);//初始化为10的数组
        StringBuilder sb3 = new StringBuilder("hello world");//初始化的数组长度是16+hello world的长度
        System.out.println("sb3:" + sb3.append(" java") + "sb3 len:" + sb3.capacity());
    }

    public static void test3(){
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("hello ");
        arrList.add("world");
        System.out.println("arrList:" + arrList);

    }
    /**数组到ArrayList*/
    public static void test4(){
        String [] cArray = new String[]{"a","b"};
        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(cArray));
        System.out.println("arrList:" + arrList);

    }
    /**ArrayList到数组*/
    public static void test5(){
        String [] cArray = new String[]{"a","b"};
        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(cArray));
        String[] dArray = new String[arrList.size()] ;
        arrList.toArray(dArray);
        System.out.println("dArray:" + Arrays.toString(dArray));

    }
    public static void main(String[] args){
        test1();
        test2();
        test3();
        test4();
        test5();
    }
}
