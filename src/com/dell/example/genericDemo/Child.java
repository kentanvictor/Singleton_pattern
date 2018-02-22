package com.dell.example.genericDemo;

/**
 * Created by 20304 on 2017/11/4.
 */
public class Child<T1, T2, T3> extends Parent<T1, T2> {
    private T3 fool3;

    public T3 getFool3() {
        return fool3;
    }

    public void setFool3(T3 fool3) {
        this.fool3 = fool3;
    }

}
