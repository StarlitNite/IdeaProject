package Test;

import add_item.*;
import add_meat.*;
import buy_order.*;
import open_machine.*;
import repair.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client extends JFrame {
	public Client(String name) {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setSize(600, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setTitle("自动贩卖机系统");

		JPanel panel = new JPanel();
		this.setLayout(new FlowLayout(1, 10, 10));

		JButton add_item = new JButton("补充商品");
		JButton add_meat = new JButton("购买套餐");
		JButton buy_order = new JButton("创建订单");
		JButton open_machine = new JButton("控制贩卖机");
		JButton repair = new JButton("贩卖机维修");

		add_item.addActionListener(new add_item_Listener());
		add_meat.addActionListener(new add_meatListener());
		buy_order.addActionListener(new buy_orderListener());
		open_machine.addActionListener(new open_machineListener());
		repair.addActionListener(new repairListener());

		this.add(add_item);
		this.add(add_meat);
		this.add(buy_order);
		this.add(open_machine);
		this.add(repair);
	}

	class add_item_Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Client.this.dispose();
				new Client_add_item("自动贩卖机系统");
			} catch (Exception b) {
				System.out.println(b.getMessage());
			}
		}
	}

	class add_meatListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Client.this.dispose();
			new Client_add_meat("自动贩卖机系统");
		}
	}

	class buy_orderListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Order_No no1, no2;
			no1 = Order_No.getInstance();
		}
	}

	class open_machineListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Client.this.dispose();
			new Client_Control("自动贩卖机系统");
		}
	}

	class repairListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Client.this.dispose();
			new Client_repair("自动贩卖机系统");
		}
	}

	public static void main(String atgs[]) {
		Client demo = new Client("自动贩卖机系统");
	}

}
