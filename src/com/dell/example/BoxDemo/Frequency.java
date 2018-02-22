package com.dell.example.BoxDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 20304 on 2017/11/4.
 */
public class Frequency {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();

        for (String word : args)
        {
            Integer freq = map.get(word);
            map.put(word,(null == freq) ? 1 : freq +1);
        }

        System.out.println(map);
    }
}
