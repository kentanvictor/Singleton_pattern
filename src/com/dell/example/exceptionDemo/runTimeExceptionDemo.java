package com.dell.example.exceptionDemo;

/*
 * Created by 20304 on 2017/11/4.
 */
public class runTimeExceptionDemo {
    public void method()throws Exception
    {
        System.out.println("Hello World");;
        throw new Exception();
    }

    public static void main(String[] args) {
        runTimeExceptionDemo test = new runTimeExceptionDemo();
        try {
            test.method();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("aaabbccc");
        }
    }
}
