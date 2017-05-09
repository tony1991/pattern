package com.alibaba.pattern.strategy;

public class Benz implements IStrategy {

    @Override
    public void run() {
        System.out.println("Benz");
    }

}
