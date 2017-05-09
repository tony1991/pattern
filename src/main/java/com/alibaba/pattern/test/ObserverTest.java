package com.alibaba.pattern.test;

import com.alibaba.pattern.observer.FoodSubject;
import com.alibaba.pattern.observer.Observer;
import com.alibaba.pattern.observer.ObserverA;
import com.alibaba.pattern.observer.ObserverB;

/**
 * @author tfj
 * 2014-8-20
 */
public class ObserverTest {
	public static void main(String[] args) {
		//创建微信公众号对象-美食汇
        FoodSubject foodSubject = new FoodSubject();
        //创建微信使用者
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        //让微信使用者关注美食汇
        foodSubject.registerObserver(observerA);
        foodSubject.registerObserver(observerB);
        //美食汇向其关注者推送消息
        foodSubject.notifyObserver("感谢关注美食汇的用户！");
	}
}
