package com.company.java.door._1_basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * created by benyafang on 2019/10/31 12:54
 * 迭代器中remove
 * */
public class Test6 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer a = iterator.next();
            if(a % 2 == 0){
                System.out.println(a);
                iterator.remove();
            }
        }
        System.out.println(list.size());
//        for(Integer x:list){
//            if(x % 2 == 0){
//                list.remove(x);
//            }
//        }
//        System.out.println(list.size());
//        System.out.println(list);//[1,2]当4被remove的时候，2前进了以为，没有遍历到2
    }
}
