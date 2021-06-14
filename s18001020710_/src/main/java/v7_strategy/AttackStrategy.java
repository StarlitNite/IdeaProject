package v7_strategy;

import launcher.Animal;

/**
 * 提供攻击的策略
 * 
 * 策略模式
 * @see {@link v3_template_method.AttackTemplate}
 */
public interface AttackStrategy {
	/**
	 * 使用策略攻击小动物
	 * @param animal 遭受攻击的小动物
	 */
	void attack(Animal animal);
}
