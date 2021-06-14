package launcher;

import javax.swing.JFrame;

import v1_state.BattlingState;
import v1_state.State;
import v4_composite_iterator.PaintableComposite;

/**
 * PaintableComposite 根容器
 * 
 */
public class BattleBoard extends PaintableComposite {

	/**
	 * 当前战斗板状态
	 */
	private State state;
	/**
	 * 界面窗口
	 */
	private JFrame frame;

	/**
	 * 转换状态
	 */
	public void changeState(State state) {
		// 调用取消状态方法
		if (this.state != null) {
			this.state.onDetached();
		}
		// 设置状态
		this.state = state;
		// 清理根容器
		this.removeAll();
		// 清理 ui 界面
		frame.getContentPane().removeAll();
		// 关联状态
		this.state.onAttached();
		this.state.doPaint(frame);
		// 调整 ui 组件大小和位置
		frame.pack();
		// 固定窗口大小
		frame.setSize(315, 178);
	}

	/**
	 * 启动战斗面板
	 */
	public void start() {
		// ui 界面生成
		frame = new JFrame("Piggy War");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		// 切换到战斗状态
		this.changeState(new BattlingState(this));
		frame.setVisible(true);
	}

}
