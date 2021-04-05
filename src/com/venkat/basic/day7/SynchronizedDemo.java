package com.venkat.basic.day7;

public class SynchronizedDemo
{
    public static int a =10;
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().isDaemon());
        Display d = new Display();
        MyThread t1 = new MyThread(d,"Venkat");

        MyThread t2 = new MyThread(d,"Teja");
        t1.start();
        t2.start();


    }

    static
    {
        String name = "venkat";
    }
}
