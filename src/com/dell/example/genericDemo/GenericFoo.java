package com.dell.example.genericDemo;

/**
 * Created by 20304 on 2017/11/7.
 */
public class GenericFoo<T> {

    private T foo;

    public T getFoo() {
        return foo;
    }

    public void setFoo(T foo) {
        this.foo = foo;
    }

    public static void main(String[] args) {
        GenericFoo<Boolean> foo1 = new GenericFoo<Boolean>();
        GenericFoo<Integer> i1 = new GenericFoo<Integer>();
        foo1.setFoo(new Boolean(false));
        i1.setFoo(new Integer(3));

        System.out.println(foo1.getFoo());
        System.out.println(i1.getFoo());
    }

}
