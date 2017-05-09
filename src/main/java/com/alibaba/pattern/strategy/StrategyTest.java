package com.alibaba.pattern.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        IStrategy st = new BMW();
        Context context = new Context(st);
        context.run();
    }
}
