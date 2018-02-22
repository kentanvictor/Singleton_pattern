package com.dell.example;

/**
 * Created by 20304 on 2017/11/19.
 */
public class MyThread implements Runnable{

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt,"t1");
        Thread t2 = new Thread(mt,"t2");
        Thread t3 = new Thread(mt,"t3");
        Thread t4 = new Thread(mt,"t4");
        Thread t5 = new Thread(mt,"t5");
        Thread t6 = new Thread(mt,"t6");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }

    @Override
    public void run() {
        //synchronized后面括号里是一对象,此时,线程获得的是对象锁.
        synchronized (this)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
