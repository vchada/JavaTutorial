package com.venkat.basic.SetDemo;

public class TestInnerClass
{
    public static void main(String[] args)
    {
        Food f = new Food()
        {
            public void taste()
            {
                System.out.println("Spicy");
            }
        };

    }
}
