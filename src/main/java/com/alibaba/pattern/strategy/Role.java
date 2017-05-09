/**
 * 
 */
package com.alibaba.pattern.strategy;

/**
 * @author tfj
 * 2014-8-20
 */
public abstract class Role {
	/**
	 * 角色名
	 */
	public String name;
	/**
	 * 角色的外貌
	 */
	public abstract void display(String sex);
	/**
	 * 角色逃跑技能
	 */
	public abstract void run();
	/**
	 * 角色攻击技能
	 */
	public abstract void attack();
	/**
	 * 角色防御技能
	 */
	public abstract void defend();
}
