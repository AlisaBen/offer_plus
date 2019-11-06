package com.company.java.door.thread.suspend_resume_test;

/**
 * suspend中断线程的缺点——独占
 * */
public class SynchronizedObject {
    //这段代码是临界区，所以加synchronized关键字同步，线程之间等待释放锁
    synchronized public void printString(){
        System.out.println(Thread.currentThread().getName() + "begin");
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("a线程suspend了");
            Thread.currentThread().suspend();
        }
        System.out.println(Thread.currentThread().getName() + "end");

    }
}
