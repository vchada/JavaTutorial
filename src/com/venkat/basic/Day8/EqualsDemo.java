package com.venkat.basic.Day8;

public class EqualsDemo
{


    public static void main(String[] args)
    {

        StringBuffer sb = new StringBuffer(); // 16  nwe capacity = (current capacity+1) *2

        System.out.println(sb.capacity());//16

        sb.append("abcdefghijklmnop");


        StringBuilder sb1 = new StringBuilder();


        System.out.println(sb.capacity());//16

        sb.append("q");

        System.out.println(sb.capacity());
       sb.insert(4,"x");

       sb.reverse();

        System.out.println(sb);




    }
}
