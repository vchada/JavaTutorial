package com.venkat.basic.day4;

public class Demo3 implements Demo4,Interface2
{

    @Override
    public int add(int a, int b) {
        int c = a+b;
        return c;
    }

    @Override
    public void multiply() {

    }


}
