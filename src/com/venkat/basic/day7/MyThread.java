package com.venkat.basic.day7;

public class MyThread extends Thread
{
    Display d;
    String name;

    MyThread(Display d, String name)
    {
        this.d=d;
        this.name = name;
    }

    @Override
    public void run()
    {
        d.wish(name);
    }


}
