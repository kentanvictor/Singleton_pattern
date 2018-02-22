package com.dell.example.StrategyDemo;

/**
 * Created by 20304 on 2017/11/25.
 */
public class StrategyDemo {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();
        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();
        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}
class Context
{
    Strategy strategy;
    //初始化时，传入具体的策略对象
    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }
    //上下文接口
    public void ContextInterface()
    {
        //根据具体的算法对象调用具体的算法
        strategy.AlgorithmInterface();
    }
}
