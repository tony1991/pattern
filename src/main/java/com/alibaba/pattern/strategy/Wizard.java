/**
 * 
 */
package com.alibaba.pattern.strategy;

/**
 * @author tfj
 * 2014-8-20
 * 角色-法师
 * 使用策略模式之后就不需要了
 */
public class Wizard extends Role{


	public void display(String sex) {
		System.out.println("我是"+sex+"法师");
	}
	
	@Override
	public void run() {
		System.out.println("金蝉脱壳！");
	}
	
	@Override
	public void attack() {
		System.out.println("毁天灭地！");
	}
	
	@Override
	public void defend() {
		System.out.println("铁布衫！");
	}

}
