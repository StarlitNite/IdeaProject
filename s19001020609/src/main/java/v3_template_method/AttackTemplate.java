package v3_template_method;

import v7_strategy.AttackStrategy;

/**
 * 封装攻击算法模板接口
 * 
 * 模板模式
 */
public interface AttackTemplate {
	/**
	 * 对小动物发起攻击
	 */
	void attack();
	/**
	 * 变更攻击策略
	 * 
	 * @param strategy 攻击策略
	 */
	void changeStrategy(AttackStrategy strategy);
}
