package com.company.java.door._1_basic;

import java.util.HashSet;

public class Test8 {
    public static void main(String[] args){
        String a = new String("ab");
        String b = new String("ab");
        String aa = "ab";
        String bb = "ab";
        System.out.println(aa == bb);//true
        System.out.println(a == b);//false
        System.out.println(aa.equals(bb));//true
        System.out.println(a.equals(b));//true
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
    }
}
