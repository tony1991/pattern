/**
 * 
 */
package com.alibaba.pattern.decorator;

/**
 * @author tfj
 * 2014-8-21
 */
public class FLLCar implements Car {

	@Override
	public void drive() {
		System.out.println("法拉利开走了");
	}

}
