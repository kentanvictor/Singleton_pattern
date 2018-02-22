package com.dell.example.pattern;

import java.lang.reflect.Method;

/*
 * Created by JohnnyTan on 2017/10/2.
 */
public class SingletonTest {
    public static void main(String[] args) throws Exception{
        Class<?> classType = Class.forName(args[0]);
        Method[] methods =  classType.getDeclaredMethods();
        for(Method method : methods)
        {
            System.out.println(method);
        }
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);//用來判断是否只生成了一個实例，如果返回true，那么证明生成的两个对象所指向的是同一个实例。
    }
}

class Singleton {
    private static Singleton singleton = new Singleton();//只有静态方法才能够调用静态方法

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(singleton == null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }
}
