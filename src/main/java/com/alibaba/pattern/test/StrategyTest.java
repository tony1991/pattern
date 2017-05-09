package com.alibaba.pattern.test;

import com.alibaba.pattern.strategy.AttackHTMD;
import com.alibaba.pattern.strategy.DefendTBS;
import com.alibaba.pattern.strategy.DisplayA;
import com.alibaba.pattern.strategy.FurtherRole;
import com.alibaba.pattern.strategy.RoleA;
import com.alibaba.pattern.strategy.RunJCTQ;

/**
 * @author tfj
 * 2014-8-20
 */
public class StrategyTest {
	public static void main(String[] args) {
		//策略模式测试
		FurtherRole roleA = new RoleA("A");  
		//根据经理要求，设立一个金蝉脱壳！，毁天灭地！，铁布衫！，样子1的角色A 
        roleA.setAttackBehavior(new AttackHTMD())  
                .setDefendBehavior(new DefendTBS())  
                .setDisplayBehavior(new DisplayA())  
                .setRunBehavior(new RunJCTQ());  
        System.out.println(roleA.name + ":");  
        roleA.run();  
        roleA.display(); 
        roleA.attack();  
        roleA.defend();  
	}
}
