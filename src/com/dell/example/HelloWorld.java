package com.dell.example;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

/**
 * Created by 20304 on 2017/11/24.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(randomString(-229985452) + ' ' + randomString(-147909649));
    }
    @NotNull
    public static String randomString(int seed)
    {
        Random rand = new Random(seed);
        StringBuilder sb = new StringBuilder();
        while (true)
        {
            int n = rand.nextInt(27);
            if (n == 0)
                break;
            sb.append((char)('`' + n));
        }
        return sb.toString();
    }
}
