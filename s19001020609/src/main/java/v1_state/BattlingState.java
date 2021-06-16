package v1_state;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import launcher.Animal;
import launcher.BattleBoard;
import launcher.Pig;
import v2_observer.HealthPoints;
import v2_observer.HealthPointsObserver;
import v3_template_method.AttackTemplate;
import v3_template_method.SimpleAttackTemplate;
import v5_adapter.AnimalPaintableCompositeAdapter;
import v5_adapter.AttackButtonPaintableCompositeAdapter;
import v5_adapter.HealthPointsPaintableCompositeAdapter;
import v7_strategy.AttackStrategy;

/**
 * 战斗状态
 */
public class BattlingState extends SimpleAttackTemplate implements State {
	//战斗面板，对象
	private BattleBoard board;
	private Animal pig;

	public BattlingState(BattleBoard board) {
		this.board = board;
	}

	public void onAttached() {
		pig = new Pig();
		//添加 可描绘组合 于 战斗板可描绘组合 中
		this.board.add(new AnimalPaintableCompositeAdapter(pig));//目标头像
		this.board.add(new HealthPointsPaintableCompositeAdapter(pig.getHp()));//目标血量
		this.board.add(new AttackButtonPaintableCompositeAdapter(this));//攻击按钮
		// 监听小猪的生命值是否降到零
		// 转换到游戏结束状态
		pig.getHp().addObserver(new HealthPointsObserver() {

			@Override
			public void update(HealthPoints hp) {
				if(hp.getCurrent() == 0) {
					board.changeState(new GameOverState(board));
				}
			}
		});
	}

	/**
	 * 交由状态机进行界面切换
	 */
	@Override
	public void doPaint(JFrame frame) {
		// 调整界面布局
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		this.board.onPaint(frame);
	}

	@Override
	public void onDetached() {
		// 清理
		pig = null;
		board = null;
		System.gc();
	}

	@Override
	public Animal getAnimal() {
		return pig;//返回目标头像
	}

}
