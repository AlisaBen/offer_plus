package com.company.java.door;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args){
        ArrayList<Integer> test = new ArrayList<>();
        System.out.println(test.size());
        test.add(4);
        test.add(2);
        test.add(1);
        test.add(0);
        Integer[] integer = test.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integer));
        Iterator it = test.iterator();
        while (it.hasNext()){
            int tmp = (int) it.next();

            if(tmp == 1){
//                System.out.println("00");
                it.remove();
            }
//            if(it.next() == 1)it.remove();
            System.out.println(tmp);
        }
        it = test.iterator();
        while (it.hasNext()){
            int tmp = (int) it.next();
//            if(it.next() == 1)it.remove();
            System.out.println(tmp);
        }
//        try {
//            int a = 4 / 0;
//
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }catch (NullPointerException e1){
//            System.out.println(e1);
//        }finally {
//            System.out.println("gg");
//        }
    }
}
