package com.dell.example;

/**
 * Created by 20304 on 2017/11/5.
 */
public class TestVarargs {
    private static int sum(String str,int... nums) {
        int sum = 0;
        for (int num : nums)
        {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = sum("a",new int[] {1,2,3});
        System.out.println(result);
        result = sum("b",1,2,3,4);
        System.out.println(result);
    }
}

