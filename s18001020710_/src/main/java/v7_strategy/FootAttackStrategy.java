package v7_strategy;

import launcher.Animal;

/**
 * 用脚攻击
 */
public class FootAttackStrategy implements AttackStrategy {

	@Override
	public void attack(Animal animal) {
		animal.getHp().decrease(20);
	}
}
