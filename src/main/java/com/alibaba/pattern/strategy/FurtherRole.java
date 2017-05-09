/**
 * 
 */
package com.alibaba.pattern.strategy;

/**
 * @author tfj
 * 2014-8-20
 */
public abstract class FurtherRole {
    public String name;  

    protected IAttack attackBehavior;
    protected IRun runBehavior;
    protected IDefend defendBehavior;
    protected IDisplay displayBehavior;

	public FurtherRole setAttackBehavior(IAttack attackBehavior) {
		this.attackBehavior = attackBehavior;
		 return this;  
	} 
	public FurtherRole setRunBehavior(IRun runBehavior) {
		this.runBehavior = runBehavior;
		return this;  
	} 
	public FurtherRole setDefendBehavior(IDefend defendBehavior) {
		this.defendBehavior = defendBehavior;
		return this;  
	} 
	public FurtherRole setDisplayBehavior(IDisplay displayBehavior) {
		this.displayBehavior = displayBehavior;
		return this;  
	} 
		
	public void attack()  
	{  
		attackBehavior.attack();  
	} 
	
	public void run()  
	{  
		runBehavior.run();  
	} 
	
	public void defend()  
	{  
		defendBehavior.defend();  
	} 
	
	public void display()  
    {  
        displayBehavior.display();  
    } 
}
