package observer.v3;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import observer.v2.Display;

public class BarDisplay2 implements Display {
	private JPanel view;
	private BarPic tBar,hBar,pBar;

	public BarDisplay2() {
		view = new JPanel();
		view.setLayout(new GridLayout(1,3));
		view.add(tBar = new LineDecorate(new BarPic(Color.RED,"ÎÂ¶È",50,20)));
		view.add(hBar = new LineDecorate(new BarPic(Color.BLUE,"Êª¶È",100,75)));
		view.add(pBar = new LineDecorate(new BarPic(Color.GREEN,"Ñ¹Á¦",1000,500)));
	}

	public JPanel getView() {
		return view;
	}

	@Override
	public void display(double t, double h, double p) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(double t, double h, double p) {
		tBar.setValue(t+20);
		hBar.setValue(h);
		pBar.setValue(p-1000);
	}
}
