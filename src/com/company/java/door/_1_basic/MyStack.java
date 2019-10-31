package com.company.java.door._1_basic;

import java.util.Arrays;

/**
 * created by benyafang on 2019/10/30
 * 用数组实现栈，入栈push，出栈pop，返回栈顶元素，但是不出栈peek，栈大小，栈是否为空isEmpty
 * */
public class MyStack {
    private int[] stack;//栈数组
    private int count = 0;//栈中的元素
    private int index = -1;//栈顶索引
    private int capacity = 8;//默认的栈的大小
    private int FACTOR = 2;
    public MyStack(){
        this.stack = new int[this.capacity];
    }
    public MyStack(int capacity){
        this.capacity = capacity;
        this.stack = new int[this.capacity];
    }
    public boolean isEmpty(){
        return this.count == 0;
    }
    public int size(){
        return this.count;
    }
    public void push(int x){
        if(this.capacity == this.count){
            this.ensureCapacity();
        }
        this.stack[++this.count - 1] = x;
    }
    public void ensureCapacity(){
        this.capacity = this.FACTOR * this.capacity;
        this.stack = Arrays.copyOf(this.stack,this.capacity);
    }
    public int peek(){
        if(this.count == 0){
            throw new IllegalArgumentException("no data");
        }
        return this.stack[count - 1];
    }
    public int pop(){
        if(this.count == 0){
            throw new IllegalArgumentException("no data");
        }
        int x = this.stack[this.count - 1];
        this.count --;
        return x;
    }

    public static void main(String[] args){
        MyStack s = new MyStack();
        s.push(4);
        s.push(23);
        s.push(45);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
    }
}
