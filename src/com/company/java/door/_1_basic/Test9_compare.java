package com.company.java.door._1_basic;

import java.util.*;

/**
 * created by Arya on 2019/11/6 12:04
 * comparable和Comparator
 * */
public class Test9_compare {
    /**Comparator*/
    public static void test1(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(-9);
        arrayList.add(4);
        System.out.println("原始数组："+arrayList);//[-1, 3, 3, -5, -9, 4]
        Collections.reverse(arrayList);
        System.out.println("Collections.reverse(arrayList) = "+ arrayList);//[4, -9, -5, 3, 3, -1]

        Collections.sort(arrayList);
        System.out.println("Collections.sort(arrayList) = " + arrayList);//[-9, -5, -1, 3, 3, 4]

        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
//                return o1.compareTo(o2);
            }
        });
        System.out.println("定制排序后：" + arrayList);//[4, 3, 3, -1, -5, -9]
    }
    public static void test2(){
        TreeMap<Person,String> pdata = new TreeMap<>();
        pdata.put(new Person("张三",30),"zhangsan");
        pdata.put(new Person("李四",20),"lsi");
        pdata.put(new Person("王五",10),"wangwu");
        pdata.put(new Person("小红",5),"xiaohong");
        Set<Person> keys = pdata.keySet();
        for(Person key : keys){
            System.out.println(key.getAge() + "-" + key.getName());
        }
    }
    public static void test3(){
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("张三",30));
        arrayList.add(new Person("李四",20));
        arrayList.add(new Person("王五",10));
        arrayList.add(new Person("小红",5));
        arrayList.add(new Person("zhaolei",34));
        System.out.println("原始数组：");//[-1, 3, 3, -5, -9, 4]
        for(Person key : arrayList){
            System.out.println(key.getAge() + "-" + key.getName());
        }

        Collections.sort(arrayList);
        System.out.println("Collections.sort(arrayList) = " );//[-9, -5, -1, 3, 3, 4]
        for(Person key : arrayList){
            System.out.println(key.getAge() + "-" + key.getName());
        }

    }
    public static void main(String[] args){
//        test1();
//        test2();
        test3();
    }
}
