package repair;

import java.awt.FlowLayout;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Client_repair extends JFrame 
{
    JPanel panel=new JPanel();
    JLabel pwp = new JLabel("故障程度");
    JTextField qwq = new   JTextField(10);
    JButton repair = new JButton("贩卖机维修");
	 public Client_repair(String name){
	 		this.setLayout(new FlowLayout(FlowLayout.LEFT));
	        this.setSize(600,100);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	        this.setVisible(true);
	        this.setTitle("自动贩卖机系统");
	        this.setLayout(new FlowLayout(1,10,10));
	        
	        repair.addActionListener(new repairListener());
	        
	        this.add(pwp);
	        this.add(qwq);
	        this.add(repair);
	 }
     class repairListener implements ActionListener{
	        @Override
	        public void actionPerformed(ActionEvent e) {
	    		Advance lv1,lv2,lv3,lv4;
	    		
	    		lv1=new Lv1_Machinic();
	    		lv2=new Lv2_Machinic();
	    		lv3=new Lv3_Machinic();
	    		lv4=new Lv4_Machinic();
	    		
	    		lv1.setSuccessor(lv2);
	    		lv2.setSuccessor(lv3);
	    		lv3.setSuccessor(lv4);
	    		
	    		String str = qwq.getText();
	    		int Falut = Integer.parseInt(str);
	    		Repair_Request lr1=new Repair_Request(Falut);
	    		lv1.handleRequest(lr1);
	        }
	        
     }
}