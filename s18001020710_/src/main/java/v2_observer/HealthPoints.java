package v2_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 生命值订阅主题（可观察对象）
 * 
 * 观察者模式
 *
 */
public class HealthPoints {
	private int points = 0;
	private int max = 0;
	
	public HealthPoints(int points) {
		super();
		this.points = points;
		this.max = points;
	}

	// 保存观察者
	private List<HealthPointsObserver> observers = new ArrayList<>();
	
	public void addObserver(HealthPointsObserver observer) {
		this.observers.add(observer);
	}
	public void removeObserver(HealthPointsObserver observer) {
		this.observers.remove(observer);
	}
	
	/**
	 * 获取该生命值对象的最大值
	 * 
	 * @return 生命值最大值
	 */
	public int getMax() {
		return this.max;
	}
	
	/**
	 * 获取当前剩余的生命值
	 * 
	 * @return 当前生命值
	 */
	public int getCurrent() {
		return this.points;
	}
	
	/**
	 * 改变生命值
	 * @param increment 增量
	 */
	public void decrease(int increment) {
		this.points -= increment;
		if (this.points < 0) {
			this.points = 0;
		}
		this.notifyObservers();
	}
	
	/**
	 *  通知观察者生命值已改变
	 */
	public void notifyObservers() {
		for (int i = 0; i < this.observers.size(); i++) {
			observers.get(i).update(this);
		}
	}
}
