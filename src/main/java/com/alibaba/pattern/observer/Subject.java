/**
 * 
 */
package com.alibaba.pattern.observer;

/**
 * @author tfj
 * 2014-8-20
 * 抽象主题类：此处模拟为一个微信公众号，向它的关注者发送订阅消息
 */
public interface Subject {

	/**
	 * 注册（添加）观察者
	 * @param observer
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * 删除观察者
	 * @param observer
	 */
	public void removeObserver(Observer observer);

	/**
	 * 通知所有的观察者
	 * @param msg 公众号发布的订阅信息
	 */
	public void notifyObserver(String msg);
}
