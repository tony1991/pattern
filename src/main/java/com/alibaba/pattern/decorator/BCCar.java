/**
 * 
 */
package com.alibaba.pattern.decorator;

/**
 * @author tfj
 * 2014-8-21
 */
public class BCCar implements Car {

	@Override
	public void drive() {
		System.out.println("奔驰车开走了");
	}

}
