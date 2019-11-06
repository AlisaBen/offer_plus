package com.company.java.door.thread.suspend_resume_test;

import java.util.Objects;

public class Run {
    public static void test1(){
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.suspend();
            System.out.println("A= " + System.currentTimeMillis() + " i= " + thread.getI());

            Thread.sleep(5000);
            System.out.println("A= " + System.currentTimeMillis() + " i= " + thread.getI());
            thread.resume();
            Thread.sleep(2000);
            System.out.println("B= " + System.currentTimeMillis() + " i= " + thread.getI());



        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void test2(){
        try {
            SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(2000);//等待2s，线程1可以有足够的时间独占资源
            Thread thread2 = new Thread(){
                @Override
                public void run() {
                    System.out.println("thread2 启动");
                    object.printString();//线程2的end不会打印
                }
            };
            thread2.start();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
//        test1();
        test2();
    }
}
