package com.venkat.basic.day6;

public class InsufficientFundsException extends RuntimeException
{
    InsufficientFundsException(String s)
    {
        super(s);
    }
}
