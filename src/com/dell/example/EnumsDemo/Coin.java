package com.dell.example.EnumsDemo;

/**
 * Created by 20304 on 2017/11/6.
 */
public enum Coin {

    penny("hello"),nickel("world"),dime("welcome"),quarter("hello World");

    private String value;

    public String getValue()
    {
        return value;
    }

    Coin(String value)
    {
        this.value = value;
    }

    public static void main(String[] args) {
        Coin coin = Coin.quarter;
        System.out.println(coin.getValue());
    }
}
