package com.venkat.basic.day6;

public class UserDefinedExceptionDemo
{
    public static void main(String[] args) {

        int a = 10;
        if(a<11)
        {
            throw new InsufficientFundsException("Insuffient Funds...");
        }

    }
}
