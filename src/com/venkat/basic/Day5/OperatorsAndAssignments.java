package com.venkat.basic.Day5;

public class OperatorsAndAssignments {
    /**
     * int a = x + y;
     *
     *
     * 1 - 0001
     *
     *  !=
     *
     *
     */

    public static void main(String[] args)
    {
      methodA();
      methodB();

    }


    public static void methodA()
    {
        methodB();
    }

    public static void methodB() {
        int a = 13/0;
    }


}
