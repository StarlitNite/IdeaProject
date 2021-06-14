package v7_strategy;

import launcher.Animal;

/**
 * 用 拳 攻击
 */
public class BoxingAttackStrategy implements AttackStrategy {

	@Override
	public void attack(Animal animal) {
		animal.getHp().decrease(10);
	}

}
