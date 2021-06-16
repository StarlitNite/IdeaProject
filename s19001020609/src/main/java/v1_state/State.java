package v1_state;

import javax.swing.JFrame;

/**
 * 状态接口
 * 
 * 状态机设计模式
 *
 */
public interface State {
	/**
	 * 状态关联后发起调用
	 */
	void onAttached();

	/**
	 * 状态关联后，描绘 ui 界面
	 * @param frame ui 展示容器
	 */
	void doPaint(JFrame frame);

	/**
	 * 状态取消关联
	 */
	void onDetached();
}
