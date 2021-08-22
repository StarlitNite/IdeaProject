package command.view;

import command.model.Light;

import javax.swing.*;
import java.awt.*;

public class LightView2 extends JPanel{
	private Light light;
	public LightView2(Light light) {
		this.light = light;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(light.isOn()) {
			g.setColor(Color.pink);
		}else {
			g.setColor(Color.white);
		}
		g.fillOval(0, 0, 50, 50);
	}
	public void update() {//得到模型变化的通知，要重画视图
		this.repaint();
	}
}
