package observer.v3;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BarPic extends JPanel{
	private final Color color;
	private final String name;
	private final int scope;
	private double value;
	public BarPic(Color color, String name, int scope,double value) {
		super();
		this.color = color;
		this.name = name;
		this.scope = scope;
		this.value = value;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString(name, 50, 270);

		g.setColor(color);
		g.fill3DRect(50, 50+(200-(int)(200*((value)/scope))), 30, (int)(200*((value)/scope)), false);
	}
	public void setValue(double value) {
		this.value = value;
		this.repaint();
	}

	@Override
	public String getName() {
		return name;
	}

	public int getScope() {
		return scope;
	}

	public double getValue() {
		return value;
	}

	public Color getColor() {
		return color;
	}
}
