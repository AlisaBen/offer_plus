package com.company.java.door;

import java.util.EmptyStackException;
import java.util.Stack;
import java.util.Vector;

public class Main {
    static void showpush(Stack<Integer> st,int a){
        st.push(new Integer(a));
        System.out.println("push" + a);
        System.out.println(st);
    }
    static void showpop(Stack<Integer> st){
        int a = st.pop();
        System.out.println(a);
        System.out.println(st);
    }
    public static void main(String[] args){
        System.out.println("fff");
        int a = 3;

        String s = "fff";
        Vector v = new Vector(3,4);
        System.out.println(v.capacity());
        System.out.println(v.size());
        v.addElement(4);
        v.addElement(new Integer(4));
        System.out.println(v);
        System.out.println(v.size());//长度

        Stack<Integer> st = new Stack<>();
        System.out.println(st);
        showpush(st,55);
        showpush(st,5331);
        System.out.println(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        }catch (EmptyStackException e){
            System.out.println("empty");
        }
    }
}
