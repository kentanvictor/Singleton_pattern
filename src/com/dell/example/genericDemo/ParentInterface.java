package com.dell.example.genericDemo;

/*
 * Created by JohnnyTan on 2017/11/4.
 */
public interface ParentInterface<T1,T2> {
    public void setFool1(T1 fool1);
    public void setFool2(T2 fool2);
    public T1 getFool1();
    public T2 getFool2();
}
