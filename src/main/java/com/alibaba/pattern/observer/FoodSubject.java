/**
 * 
 */
package com.alibaba.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tfj
 * 2014-8-20
 * 具体的一个微信公众号--美食汇
 */
public class FoodSubject implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver(String msg) {
		for(Observer obs : observers){
			obs.update(msg);
		}
	}

}
