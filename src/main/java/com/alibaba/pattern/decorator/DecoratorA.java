package com.alibaba.pattern.decorator;

/**
 * @author tfj
 * 2014-8-21
 * 第一个装饰器：开车前加油，开车后洗车
 */
public class DecoratorA implements Car {
	private Car car;
	public DecoratorA(Car car){
		this.car = car;
	}
	@Override
	public void drive() {
		System.out.println("加油");
		car.drive();
		System.out.println("洗车");
	}

}
