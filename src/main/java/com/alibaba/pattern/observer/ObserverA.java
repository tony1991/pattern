/**
 * 
 */
package com.alibaba.pattern.observer;

/**
 * @author tfj
 * 2014-8-20
 */
public class ObserverA implements Observer {

//	private Subject subject;
//	
//	/**
//	 * 自动默认收听，若需收听多个则这种方法不好
//	 * @param subject
//	 */
//	public ObserverA(Subject subject){
//		this.subject = subject;
//		subject.registerObserver(this);
//	}
	
	@Override
	public void update(String msg) {
		System.out.println("我是听众A，收到的美食信息是："+msg);
	}

}
