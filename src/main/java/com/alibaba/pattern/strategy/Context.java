package com.alibaba.pattern.strategy;

public class Context {

    private IStrategy strategy = null;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void run(){
        this.strategy.run();
    }
}
