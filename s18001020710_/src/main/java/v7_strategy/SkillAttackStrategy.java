package v7_strategy;

import launcher.Animal;

/**
 * 用 技能 攻击
 */
public class SkillAttackStrategy implements AttackStrategy {

	@Override
	public void attack(Animal animal) {
		animal.getHp().decrease(35);
	}

}
