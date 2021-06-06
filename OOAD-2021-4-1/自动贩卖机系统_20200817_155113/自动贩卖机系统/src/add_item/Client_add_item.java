package add_item;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client_add_item extends JFrame {
	JPanel panel = new JPanel();
	JLabel pwp = new JLabel("工厂名");
	JTextField qwq = new JTextField(10);
	JButton repair = new JButton("补充商品");

	public Client_add_item(String name) {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setSize(600, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("自动贩卖机系统");
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
				Item ab_drink;
				Item_Factory ab_fact;
				String cName = "add_item.";
				String str_factory = qwq.getText();
				cName = cName + str_factory;
				Class c = Class.forName(cName);
				Object obj = c.newInstance();
				ab_fact = (Item_Factory) obj;
				ab_drink = ab_fact.produceDrink();
				ab_drink.add();
			} catch (Exception b) {
				System.out.println(b.getMessage() + "qwq");
			}
		}

	}
}
