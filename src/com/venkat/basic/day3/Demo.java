package com.venkat.basic.day3;


import com.venkat.basic.day2.Sample;

public class Demo
{
    int a = 10;

    public static void main(String[] args)
    {
        System.out.println(args[0]);

        //Calculation.add(10,30);

        int[] intArray = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(intArray[8]);
        Calculation calculation = new Calculation();

        String message = calculation.welcome("Venkat");
        System.out.println(message);

        Sample s = new Sample();

    }


    /**
     *
     * Variables:
     *
     * primitive variables
     * reference variables
     *
     *
     *
     * Instance Variables
     * static
     * local
     * global
     *
     *
     * **/
}
