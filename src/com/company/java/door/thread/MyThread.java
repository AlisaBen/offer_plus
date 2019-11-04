package com.company.java.door.thread;

/**
 * created by Arya on 2019/11/4 23:11
 * Feature:多线程的例子
 * 1. start()方法等待系统安排时间调用线程的run方法实现异步，直接调用run方法是同步
 * 2. start()调用顺序不决定启动的顺序
 * */
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
//        System.out.println("current name:"+Thread.currentThread().getName());
        try{
            for(int i = 0;i < 10;i++){
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("thread current name:"+Thread.currentThread().getName());

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
