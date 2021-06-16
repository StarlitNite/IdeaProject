package v7_strategy;

import launcher.Animal;

/**
 * 用 掌 攻击
 */
public class PalmAttackStrategy implements AttackStrategy {

	@Override
	public void attack(Animal animal) {
		animal.getHp().decrease(15);
	}

}