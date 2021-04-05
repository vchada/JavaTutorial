package com.venkat.basic.Internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class IntDemo
{
    public static void main(String[] args)
    {
       DateFormat UK = DateFormat.getDateInstance(0, Locale.UK);
       DateFormat ITALY = DateFormat.getDateInstance(0,Locale.ITALY);

        System.out.println("UK Date: "+ UK.format(new Date()));

        System.out.println("ITALY Date: "+ITALY.format(new Date()));

    }
}
