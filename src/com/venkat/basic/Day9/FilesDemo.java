package com.venkat.basic.Day9;

import java.io.*;

public class FilesDemo
{
    public static void main(String[] args) throws IOException
    {

        System.out.println("Welcome to My APP");

        System.out.println("Enter a value");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = br.read();

        System.out.println("Enter b value");

        int b = br.read();

        System.out.println("Total value os a and b is "+ (a+b));


    }


}
