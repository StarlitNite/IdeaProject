package v5_adapter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import v1_state.BattlingState;
import v3_template_method.AttackTemplate;
import v4_composite_iterator.PaintableComposite;
import v7_strategy.BoxingAttackStrategy;
import v7_strategy.FootAttackStrategy;
import v7_strategy.PalmAttackStrategy;
import v7_strategy.SkillAttackStrategy;

/**
 * 将多个 JFrame {@link Button} 适配成 {@link PaintableComposite}
 *
 * 适配器模式
 */
public class AttackButtonPaintableCompositeAdapter extends PaintableComposite {

	public AttackButtonPaintableCompositeAdapter(final AttackTemplate template) {
		this.add(new ButtonPaintableCompositeAdapter("拳", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				template.changeStrategy(new BoxingAttackStrategy());
				template.attack();
			}

		}));
		this.add(new ButtonPaintableCompositeAdapter("掌", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				template.changeStrategy(new PalmAttackStrategy());
				template.attack();
			}

		}));
		this.add(new ButtonPaintableCompositeAdapter("脚", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				template.changeStrategy(new FootAttackStrategy());
				template.attack();
			}

		}));
		this.add(new ButtonPaintableCompositeAdapter("技能", new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				template.changeStrategy(new SkillAttackStrategy());
				template.attack();
			}

		}));
	}

	/**
	 * 适配单个 {@link JButton} 为可描绘组合
	 */
	protected class ButtonPaintableCompositeAdapter extends PaintableComposite {
		private ActionListener listener;
		private String text;

		ButtonPaintableCompositeAdapter(String text, ActionListener listener) {
			this.text = text;
			this.listener = listener;
		}

		private JButton button;

		/**
		 * 描绘单个 JButton
		 */
		@Override
		public void onPaint(JFrame frame) {
			super.onPaint(frame);
			button = new JButton(this.text);
			button.addActionListener(listener);
			frame.add(button);
		}
	}
}
