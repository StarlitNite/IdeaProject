package v5_adapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import launcher.Animal;
import v4_composite_iterator.PaintableComposite;

/**
 * 把 {@link Animal} 对象是目标 {@link PaintableComposite}
 *
 * 适配器模式
 */
public class AnimalPaintableCompositeAdapter extends PaintableComposite {

	private Animal animal;

	public AnimalPaintableCompositeAdapter(Animal animal) {
		this.animal = animal;
	}

	@Override
	public void onPaint(JFrame frame) {
		super.onPaint(frame);
		//界面对象图片
		ImageIcon icon = new ImageIcon(animal.getName() + ".jpg");
		JButton button = new JButton(icon);
		button.setContentAreaFilled(false);
		button.setSize(8, 8);
		button.setBorder(null);
		frame.add(button);
	}

}
