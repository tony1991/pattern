package com.alibaba.pattern.decorator;

/**
 * @author tfj
 * 2014-8-21
 * 第一个装饰器：开车前加油，开车后洗车
 */
public class DecoratorB implements Car {
	private Car car;
	public DecoratorB(Car car){
		this.car = car;
	}
	@Override
	public void drive() {
		System.out.println("检查车子");
		car.drive();
		System.out.println("保养车子");
	}

}
