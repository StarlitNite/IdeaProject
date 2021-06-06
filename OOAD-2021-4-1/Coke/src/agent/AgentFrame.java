package agent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import coke.Coca_ColaFactory;
import coke.CokeFactory;
import coke.PepsiFactory;
import company.Coca_ColaCompany;
import company.PepsiCompany;
import customer.Order;
import customer.OrderBuidler;
import message.Message;
import message.Recipient;
//程序运行时呈现的窗体
public class AgentFrame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	public JLabel label;
	public JButton b1,b2,b3;
	public JPanel panel;
	public JTextArea tf1;
	public JCheckBox cb1,cb2;
	public JRadioButton rb1,rb2;
	public JScrollPane sp;
	int count = 0;
	Agent agent = Agent.getInstance();//单例生成对象
	Coca_ColaCompany coca = Coca_ColaCompany.getInstance();
	PepsiCompany pepsi = PepsiCompany.getInstance();
	public AgentFrame() {
		super("可乐商城");
		label = new JLabel("1代理商选择进货              2 可乐公司供货                3 顾客购买商品");
		b1 = new JButton("确认");
		b2 = new JButton("发货&提醒");
		b3 = new JButton("确定");
		panel = new JPanel();
		tf1 = new JTextArea();
		cb1 = new JCheckBox("可口可乐");
		cb2 = new JCheckBox("百事可乐");
		rb1 = new JRadioButton("门店自取");
		rb2 = new JRadioButton("快递送达");
		sp = new JScrollPane();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		tf1.setText("");
		tf1.setLineWrap(true); //自动换行
	
		panel.setLayout(null);//将panel的布局设置为空，这样能自定义组件位置
		panel.add(label);
		panel.add(tf1);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(cb1);
		panel.add(cb2);
		panel.add(rb1);
		panel.add(rb2);
		panel.add(sp);
		label.setBounds(20, 20, 400, 20);
		cb1.setBounds(20, 50, 100, 20);
		cb2.setBounds(20, 80, 100, 20);
		b1.setBounds(20, 110, 70, 30);
		b2.setBounds(150, 50, 100, 30);
		rb1.setBounds(300, 50, 100, 20);
		rb2.setBounds(300, 80, 100, 20);
		b3.setBounds(300, 110, 70, 30);
		tf1.setBounds(20, 150, 400, 200);
		sp.setBounds(20, 150, 400, 200);
		
		sp.setViewportView(tf1);
		this.setSize(450,400);//设置窗口大小
		this.setLocationRelativeTo(null);//运行程序后界面在电脑屏幕正中央显示
		this.getContentPane().add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口即结束程序
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			count=0;
			tf1.append("\n========--1、代理商选择进货--========");
			tf1.append("\n开始发送邮件...");
			Recipient recipient = new Recipient("可口可乐&百事可乐公司", "12345678@email");
			Message message = new Message("代理商",recipient);
			Message clone = (Message) message.clone();//原型模式，浅克隆邮件信息
			if (cb1.isSelected() && cb2.isSelected()) {
				agent.setMessage(clone);
				tf1.append("\n代理商向可乐公司请求进货：可口可乐*x件，百事可乐*x件，");
				tf1.append("\n发件人："+agent.getMessage().getSender()+"，收件人："+agent.getMessage().getRecipient()+"");
				tf1.append("\n邮件发送中...   发送成功!!!");
				tf1.append("\n等待可乐公司送货");
			} else if (cb1.isSelected()) {
				recipient.setName("可口可乐公司");
				clone.setRecipient(recipient);
				agent.setMessage(clone);
				tf1.append("\n代理商向可口可乐公司请求进货：可口可乐*x件，");
				tf1.append("\n发件人："+agent.getMessage().getSender()+"，收件人："+agent.getMessage().getRecipient()+"");
				tf1.append("\n邮件发送中...   发送成功!!!");
				tf1.append("\n等待可乐公司送货");
			} else if (cb2.isSelected()) {
				recipient.setName("百事可乐公司");
				clone.setRecipient(recipient);
				agent.setMessage(clone);
				tf1.append("\n代理商向百事可乐公司请求进货：百事可乐*x件");
				tf1.append("\n发件人："+agent.getMessage().getSender()+"，收件人："+agent.getMessage().getRecipient()+"");
				tf1.append("\n邮件发送中...   发送成功!!!");
				tf1.append("\n等待可乐公司送货");
			} else {
				count--;
				tf1.append("\n请选择进货商品");
				JOptionPane.showMessageDialog(this, "请选择进货物品", "提示消息", JOptionPane.WARNING_MESSAGE);
			}
			tf1.append("\n=================================\n");
			cb1.setSelected(false);//清空选择
			cb2.setSelected(false);
			count++;
		}
		if(e.getSource()==b2){
			if(!tf1.getText().equals("")&&count!=0){
				count=0;
				tf1.append("\n========--2、可乐公司供货--========");
				CokeFactory coca = new Coca_ColaFactory();//抽象工厂模式
				CokeFactory pepsi = new PepsiFactory();
				tf1.append("\n"+coca.produceCoke().produce()+"\n"+pepsi.produceCoke().produce() );
				tf1.append("\n已发货请注意查收！，邮件发送中...  发送成功!!!");
				tf1.append("\n代理商验收商品并签收，商品售卖中，顾客已支付---请选择收货方式：");
				tf1.append("\n（1）门店自取，（2）快递送达");
			}else{
				tf1.append("\n未接受到发货请求！");
				JOptionPane.showMessageDialog(this, "未接受到发货请求！", "提示消息", JOptionPane.WARNING_MESSAGE);
			}
			tf1.append("\n===============================\n");
		}
		if(e.getSource()==b3){
			tf1.append("\n========--3、销售给顾客--========");
			
			if(rb1.isSelected()||rb2.isSelected()){
				String str1= JOptionPane.showInputDialog("请输入姓名");
				String str2= JOptionPane.showInputDialog("请输入要购买的商品（可口可乐or百事可乐）");
				String str3 = null;
				if(rb2.isSelected()){
					str3= JOptionPane.showInputDialog("请输入地址");
				}
				tf1.append("\n订单生成中...");
				OrderBuidler builder = new OrderBuidler(str1, str2, str3);
				Order order = builder.create();
				tf1.append("\n顾客姓名："+order.getName());
				tf1.append("\n购买商品："+order.getGoods());
				tf1.append("\n顾客地址："+order.getAddress());
				DeliverGoods deliverGoods;
				if(!rb1.isSelected()){
					deliverGoods = new DeliverMethod(true);
					tf1.append("\n"+deliverGoods.selectMethod());
				}else{
					deliverGoods = new DeliverMethod(false);
					tf1.append("\n"+deliverGoods.selectMethod());
				}
				tf1.append("\n=============================");
				tf1.append("\n感谢您购买我们的商品，祝您购物愉快！");
			}else{
				tf1.append("\n请先选择收货方式！");
				JOptionPane.showMessageDialog(this, "请先选择收货方式！", "提示消息", JOptionPane.WARNING_MESSAGE);
			}
		}	
	}
}
