package v1_state;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import launcher.BattleBoard;

/**
 * 游戏结束状态
 */
public class GameOverState implements State {

	private BattleBoard board;

	public GameOverState(BattleBoard board) {
		this.board = board;
	}

	/**
	 * 交由状态机进行描绘有效结束界面
	 */
	@Override
	public void doPaint(JFrame frame) {
		JLabel label = new JLabel("游戏结束！");
		JButton button = new JButton("新游戏");
		JPanel panel = new JPanel();
		GridLayout layout = new GridLayout(2, 1);
		layout.setHgap(20);
		layout.setVgap(20);
		panel.setLayout(layout);
		panel.add(label);
		panel.add(button);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));

		// 新游戏从新设置为战斗状态
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				board.changeState(new BattlingState(board));
			}

		});
		frame.add(panel);
	}
	//关联状态
	@Override
	public void onAttached() {}
	//删除~清理
	@Override
	public void onDetached() {
		board = null;
		System.gc();
	}

}
