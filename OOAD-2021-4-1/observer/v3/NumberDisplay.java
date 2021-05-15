package observer.v3;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import observer.v2.Display;

public class NumberDisplay implements Display{
	private JPanel view;
	private JLabel jlNameT,jlNameH,jlNameP;
	private JTextField jtfValueT,jtfValueH,jtfValueP;	
	public NumberDisplay() {
		view = new JPanel();
		layout();
	}
	private void layout() {
		view.setLayout(new GridLayout(3,2));
		view.add(jlNameT = new JLabel("ÎÂ¶È£º"));
		view.add(jtfValueT = new JTextField());
		view.add(jlNameH = new JLabel("Êª¶È£º"));
		view.add(jtfValueH = new JTextField());
		view.add(jlNameP = new JLabel("Ñ¹Ç¿£º"));
		view.add(jtfValueP = new JTextField());
	}
	public JPanel getView() {
		return view;
	}
	@Override
	public void display(double t, double h, double p) {		
	}
	@Override
	public void update(double t, double h, double p) {
		jtfValueT.setText(""+t);
		jtfValueH.setText(""+h);
		jtfValueP.setText(""+p);
	}
}