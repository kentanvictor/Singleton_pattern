package com.dell.example.BoxDemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 20304 on 2017/11/4.
 */
public class BoxTest {
    public static void main(String[] args) {
        int a = 3;
        Collection<Integer> c = new ArrayList<Integer>();

        c.add(3);           //这里就是自动的装箱，将3转换成Integer类型并放到集合中
        c.add(a + 3);
       for (Integer i : c)
       {
           System.out.println(i);
       }
    }
}
