package launcher;

import v2_observer.HealthPoints;

public abstract class Animal {
	private HealthPoints hp;

	public Animal() {
		this.hp = new HealthPoints(this.getMaxHealthPoints());
	}
	
	public abstract int getMaxHealthPoints();
	
	public HealthPoints getHp() {
		return hp;
	}
	public abstract String getName();
	
}
