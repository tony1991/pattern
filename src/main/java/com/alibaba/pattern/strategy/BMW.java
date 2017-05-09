package com.alibaba.pattern.strategy;

public class BMW implements IStrategy {

    @Override
    public void run() {
        System.out.println("BMW");
    }

}
