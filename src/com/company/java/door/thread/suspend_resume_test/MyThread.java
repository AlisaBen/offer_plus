package com.company.java.door.thread.suspend_resume_test;

/**
 * created by Arya on 2019/11/5 8:42
 * 多线程暂停和回复
 * */
public class MyThread extends Thread{
    private long i = 0;

    public long getI() {
        return i;
    }

    @Override
    public void run() {
        while (true){
            i++;
        }
    }
}

