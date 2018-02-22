package com.dell.example.EnumsDemo;

/**
 * Created by 20304 on 2017/11/6.
 */
public class ShowEnum2 {
    public static void main(String[] args) {
        for (OpConstant c : OpConstant.values())
        {
            System.out.printf("%d , %s , %n",c.ordinal(),c);
        }
    }
}
