package com.dell.example.genericDemo;

/*
 * Created by JohnnyTan on 2017/11/4.
 */
public class Parent<T1, T2> {
    private T1 fool1;
    private T2 fool2;

    public T1 getFool1() {
        return fool1;
    }

    public void setFool1(T1 fool1) {
        this.fool1 = fool1;
    }

    public T2 getFool2() {
        return fool2;
    }

    public void setFool2(T2 fool2) {
        this.fool2 = fool2;
    }

}
