package com.venkat.basic.day4;

public class InterfaceDemo
{

    final transient int SSN = 1238760987;

    public static void main(String[] args)
    {


        String name = "Teja";

        name = name+"Dev";
    }

    public final void donotShow()
    {

        System.out.println("Confidential Data , dont show to other");

    }

    public void ShowEveryone()
    {
        System.out.println("non-confidential data/ public data");
    }


}
