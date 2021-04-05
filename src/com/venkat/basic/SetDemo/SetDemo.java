package com.venkat.basic.SetDemo;

public class SetDemo
{
    public static void main(String[] args) {


    Employee e1 = new Employee("Venkat",101);
    Employee e2 = new Employee("Venkat", 101);

    if(e1.compareTo(e2)==0)
    {
        System.out.println("both employees are equal");
    }
    else
    {
        System.out.println("both employees are not equal");
    }

    }
}
