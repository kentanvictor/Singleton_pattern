package com.dell.example.genericDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 20304 on 2017/11/7.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("String");
        list.add(new Integer(2));
        list.add(new Boolean(false));

        String str = (String) list.get(0);
        Integer in = (Integer) list.get(1);
        String  b = (String) list.get(2);
    }
}
