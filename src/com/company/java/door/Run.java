package com.company.java.door;

import com.company.java.door.thread.MyRunnable;
import com.company.java.door.thread.MyThread;

/**
 * created by Arya on 2019/11/4
 * 程序入口
 * */
public class Run {
    public static void Test1(){
        /**
         * over
         * current name:Thread-0
         * */
        try {
            MyThread thread = new MyThread();
            thread.setName("myThread");
            thread.start();//通知线程规划器，该线程已经准备好，等待调用run方法，系统安排一个时间来调用
            for(int i = 0;i < 10;i++){
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);//线程挂起
                System.out.println("main=" + Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("over");
    }
    public static void Test2(){
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable,"lalala");//构造函数传入Runnable类型的参数
        thread.start();
        System.out.println("test");
    }
    public static void main(String[] args){
//        Test1();
        Test2();
    }

}
