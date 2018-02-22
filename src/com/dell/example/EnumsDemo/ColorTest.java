package com.dell.example.EnumsDemo;

/**
 * Created by 20304 on 2017/11/6.
 */
public class ColorTest {
    public static void main(String[] args) {
        Color myColor = Color.White;
        System.out.println(myColor);
        System.out.println("-------------------------------");

        for (Color color : Color.values())
        {
            System.out.println(color);
        }
    }
}
