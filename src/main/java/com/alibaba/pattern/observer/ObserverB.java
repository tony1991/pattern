/**
 * 
 */
package com.alibaba.pattern.observer;

/**
 * @author tfj
 * 2014-8-20
 */
public class ObserverB implements Observer {

	@Override
	public void update(String msg) {
		System.out.println("我是听众B，收到的美食信息是："+msg);
	}

}
