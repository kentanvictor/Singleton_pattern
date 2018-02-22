package com.dell.example.StrategyDemo;

import java.io.Console;

/**
 * Created by 20304 on 2017/11/25.
 */
public class ConcreteStrategyA extends Strategy {
    //算法A的实现
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法A的实现");
    }
}
//具体算法B
class ConcreteStrategyB extends Strategy{
    //算法B的实现
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法B的实现");
    }
}
//具体算法C
class ConcreteStrategyC extends Strategy {
    //算法C的实现
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法C的实现");
    }
}