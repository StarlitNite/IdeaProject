package v3_template_method;

import launcher.Animal;
import v7_strategy.AttackStrategy;

/**
 * 简易攻击算法实现
 * 
 * 模板模式
 */
public abstract class SimpleAttackTemplate implements AttackTemplate {
	private AttackStrategy strategy;

	@Override
	public void attack() {
		Animal attacking = getAnimal();
		strategy.attack(attacking);
		System.out.println("小猪受到挑衅，再打一次试试？");
	}

	public void changeStrategy(AttackStrategy strategy) {
		this.strategy = strategy;
	}

	public abstract Animal getAnimal();
}
