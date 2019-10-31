package com.company.java.door._1_basic;

import java.util.Objects;

/**
 * created by benyafang on 2019/10/31
 * Java疑难点
 * 所有整型包装类对象值的比较必须使用equals方法
 * 当使用自动装箱方式创建一个Integer对象时，
 * 当数值在-128 ~127时，会将创建的 Integer 对象缓存起来，
 * 当下次再出现该数值时，直接从缓存中取出对应的Integer对象。
 * 所以上述代码中，x和y引用的是相同的Integer对象。
 * */
public class Test3 {
    public static void main(String[] args){
        String str1 = "ff";
        String str = null;
        System.out.println(Objects.equals(str,str));//true
        System.out.println(Objects.equals(str,str1));//false
        System.out.println(str1.equals(str));//false
//        System.out.println(str.equals("ff"));//exception


        Integer x = 3;
        Integer y = 3;
        System.out.println(x == y);//true
        System.out.println(x.equals(y));//true
        Integer a = new Integer(3);
        Integer b = new Integer(3);
        System.out.println(a == b);//false
        System.out.println(a.equals(b));//true
        System.out.println(a.equals(x));//true
        System.out.println(a == x);//false

    }

}
