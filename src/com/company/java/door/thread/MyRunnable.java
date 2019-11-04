package com.company.java.door.thread;

/**
 * created by Arya on 2019/11/4 23:30
 * Feature:Runnable
 * 1. Java只支持单根继承，如果创建的线程已经都一个父类，就不能再继承Thread，但是可以继承接口Runnable
 * */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("current runnable");
    }
}
