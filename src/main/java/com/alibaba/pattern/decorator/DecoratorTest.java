package com.alibaba.pattern.decorator;


/**
 * @author tfj
 * 2014-8-21
 */
public class DecoratorTest {
	public static void main(String[] args) {
		Car car1 = new DecoratorA(new BCCar());
		car1.drive();
		Car car2 = new DecoratorB(new BMWCar());
		car2.drive();
		//多层装饰
		Car car3 = new DecoratorA(new DecoratorB(new FLLCar()));
		car3.drive();
		Car car4 = new DecoratorB(new DecoratorA(new FLLCar()));
		car4.drive();
	}
}
