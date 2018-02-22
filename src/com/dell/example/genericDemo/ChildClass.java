package com.dell.example.genericDemo;

/**
 * Created by 20304 on 2017/11/4.
 */
public class ChildClass<T1,T2> implements ParentInterface<T1,T2>{

    private T1 fool1;
    private T2 fool2;
    @Override
    public void setFool1(T1 fool1) {
        this.fool1 = fool1;
    }

    @Override
    public void setFool2(T2 fool2) {
        this.fool2 = fool2;
    }

    @Override
    public T1 getFool1() {
        return this.fool1;
    }

    @Override
    public T2 getFool2() {
        return this.fool2;
    }
}
