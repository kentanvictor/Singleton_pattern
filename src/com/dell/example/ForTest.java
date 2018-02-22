package com.dell.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Created by JohnnyTan on 2017/11/4.
 */
public class ForTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10,11};

        //old
        for (int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("-------------------------------------------------------------");
        //new
        for (int element : arr)
        {
            System.out.println(element);
        }
        //字符串
        System.out.println("-------------------------------------------------------------");
        String[] names = {"hello","world","weclome"};
        for (String name : names)
        {
            System.out.println(name);
        }
        System.out.println("-------------------------------------------------------------");
        //二维数组
        int[][] atr2 = {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] row : atr2)
        {
            for (int element : row)
            {
                System.out.println(element);
            }
        }
        System.out.println("-------------------------------------------------------------");
        //集合
        Collection<String> col = new ArrayList<String>();
        col.add("one");
        col.add("two");
        col.add("three");
        for (String str : col)
        {
            System.out.println(str);
        }
        System.out.println("-------------------------------------------------------------");

        /**
        * 三种方式实现list集合内容的打印
        * */
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("def");
        list.add("hig");
        list.add("klm");
        //数组方式遍历
        for (int i = 0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------------------------------------------");
        //使用迭代器的方式进行遍历
        for (Iterator<String> iter = list.iterator();iter.hasNext();)
        {
            System.out.println(iter.next());
        }
        System.out.println("-------------------------------------------------------------");
        //增强for循环进行遍历
        for (String str : list)
        {
            System.out.println(str);
        }
    }
}
