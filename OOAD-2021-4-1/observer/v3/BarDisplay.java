package observer.v3;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import observer.v2.Display;

public class BarDisplay extends JPanel implements Display {
	private double t=15,h=80,p=1300;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("ÎÂ¶È", 50, 270);
		g.drawString("Êª¶È", 100, 270);
		g.drawString("Ñ¹Ç¿", 150, 270);
		
		g.setColor(Color.RED);
		g.fill3DRect(50, 50+(200-(int)(200*((t+20)/50))), 30, (int)(200*((t+20)/50)), false);
		
		
		g.setColor(Color.BLUE);
		g.fill3DRect(100, 50+(200-(int)(200*(h/100))), 30, (int)(200*(h/100)), false);
	
		
		g.setColor(Color.GREEN);
		g.fill3DRect(150, 50+(200-(int)(200*((p-1000)/1000))), 30, (int)(200*((p-1000)/1000)), false);
		
	}
	@Override
	public void display(double t, double h, double p) {//show on the console
		// TODO Auto-generated method stub
		//do nothing
	}
	@Override
	public void update(double t, double h, double p) {
		this.t = t;
		this.h = h;
		this.p = p;
		this.repaint();
	}
}