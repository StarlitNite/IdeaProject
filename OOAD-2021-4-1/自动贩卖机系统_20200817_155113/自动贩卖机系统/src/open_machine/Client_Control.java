package open_machine;

import java.awt.FlowLayout;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Client_Control extends JFrame 
{
    JButton open = new JButton("开启贩卖机");
    JButton close = new JButton("关闭贩卖机");
	 public Client_Control(String name){
	 		this.setLayout(new FlowLayout(FlowLayout.LEFT));
	        this.setSize(600,100);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	        this.setVisible(true);
	        this.setTitle("自动贩卖机系统");
	        this.setLayout(new FlowLayout(1,10,10));
	        
	        open.addActionListener(new openListener());
	        close.addActionListener(new closeListener());
	        
	        this.add(open);
	        this.add(close);
	 }
     class openListener implements ActionListener{
	        @Override
	        public void actionPerformed(ActionEvent e) {
				Main_Swicth switch_ = new Main_Swicth();
				switch_.Activate();
	        }
	        
     }
     class closeListener implements ActionListener{
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	Main_Swicth switch_ = new Main_Swicth();
	        	switch_.Deactivate();
	        }
	        
  }
}