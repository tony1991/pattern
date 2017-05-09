/**
 * 
 */
package com.alibaba.pattern.decorator;

/**
 * @author tfj
 * 2014-8-21
 */
public class BMWCar implements Car {

	@Override
	public void drive() {
		System.out.println("宝马车开走了");
	}

}
