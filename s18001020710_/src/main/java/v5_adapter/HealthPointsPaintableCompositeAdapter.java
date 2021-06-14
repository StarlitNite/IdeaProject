package v5_adapter;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import v2_observer.HealthPoints;
import v2_observer.HealthPointsObserver;
import v4_composite_iterator.PaintableComposite;

/**
 * 将生命值可观察对象适配成 {@link PaintableComposite } 对象
 *
 */
public class HealthPointsPaintableCompositeAdapter extends PaintableComposite  {

	private HealthPoints hp;
	private JProgressBar progressBar;

	public HealthPointsPaintableCompositeAdapter(HealthPoints hp) {
		this.hp = hp;
		// 观察生命值改变
		hp.addObserver(new HealthPointsObserver() {

			@Override
			public void update(HealthPoints hp) {
				HealthPointsPaintableCompositeAdapter.this.progressBar.setValue(hp.getCurrent());
			}

		});
	}

	/**
	 * 描绘血条
	 */
	@Override
	public void onPaint(JFrame frame) {
		super.onPaint(frame);
		progressBar = new JProgressBar(0, hp.getMax());
		progressBar.setForeground(Color.BLUE);
		progressBar.setValue(hp.getMax());
		frame.add(progressBar);
	}

}
