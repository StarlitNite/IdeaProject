package add_meat;

import java.awt.FlowLayout;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client_add_meat extends JFrame {
	JPanel panel = new JPanel();
	JLabel pwp = new JLabel("Ì×²ÍÃû");
	JTextField qwq = new JTextField(10);
	JButton repair = new JButton("¹ºÂòÌ×²Í");

	public Client_add_meat(String name) {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setSize(600, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("×Ô¶¯··Âô»úÏµÍ³");
		this.setLayout(new FlowLayout(1, 10, 10));

		repair.addActionListener(new repairListener());

		this.add(pwp);
		this.add(qwq);
		this.add(repair);
	}

	class repairListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String cName = "add_meat.";
				String str_factory = qwq.getText();
				cName = cName + str_factory;
				Class c = Class.forName(cName);
				Object obj = c.newInstance();
				MealBuilder mb = (MealBuilder)obj;
				Admin user_ = new Admin();
				user_.setMealBuilder(mb);
				Meal meal = user_.construct();
				System.out.println("Ì×²Í£º");
				System.out.println(meal.getNoodles());
				System.out.println(meal.getDrink());
				System.out.println(meal.getMeat());
			} catch (Exception b) {
				System.out.println(b.getMessage() + "qwq");
			}
		}

	}
}
