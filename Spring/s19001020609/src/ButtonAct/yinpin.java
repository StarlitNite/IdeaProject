/*
package ButtonAct;

import ButtonAct.Button1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class yinpin extends JFrame {

    public yinpin(){

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 3));
        JButton b1 = new JButton("可乐");
        JButton b2 = new JButton("雪碧");
        JButton b3 = new JButton("雀巢咖啡");
        JButton b4 = new JButton("农夫山泉");
        JButton b5 = new JButton("阿萨姆奶茶");
        JButton b6 = new JButton("宝特力矿泉水");
        JButton b7 = new JButton("佳得乐运动饮料");
        JButton b8 = new JButton("八宝粥");
        JButton b9 = new JButton("果蔬乐园");
        //面板内加入按钮
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        //添加监听器
        b1.addActionListener(new ButtonListener());
        b2.addActionListener(new ButtonListener());
        b3.addActionListener(new ButtonListener());
        b4.addActionListener(new ButtonListener());
        b5.addActionListener(new ButtonListener());
        b6.addActionListener(new ButtonListener());
        b7.addActionListener(new ButtonListener());
        b8.addActionListener(new ButtonListener());
        b9.addActionListener(new ButtonListener());

        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(p1,BorderLayout.CENTER);

        container.add(p1,BorderLayout.SOUTH);
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()){
                case "可乐":JOptionPane.showMessageDialog(null, "你选择了一听可乐！", "提示信息", JOptionPane.INFORMATION_MESSAGE);break;
                case "雪碧":JOptionPane.showMessageDialog(null, "你选择了一瓶雪碧！", "提示信息", JOptionPane.INFORMATION_MESSAGE);break;
                case "雀巢咖啡":JOptionPane.showMessageDialog(null, "你选择了一罐雀巢咖啡！", "提示信息", JOptionPane.INFORMATION_MESSAGE);break;
                case "农夫山泉":JOptionPane.showMessageDialog(null, "你选择了一瓶农夫山泉！", "提示信息", JOptionPane.INFORMATION_MESSAGE);break;
                case "阿萨姆奶茶":JOptionPane.showMessageDialog(null, "你选择了一瓶阿萨姆奶茶！", "提示信息", JOptionPane.INFORMATION_MESSAGE);break;
                case "宝特力矿泉水":JOptionPane.showMessageDialog(null, "你选择了一桶宝特力矿泉水！", "提示信息", JOptionPane.INFORMATION_MESSAGE);break;
                case "佳得乐运动饮料":JOptionPane.showMessageDialog(null, "你选择了一瓶佳得乐运动饮料！", "提示信息", JOptionPane.INFORMATION_MESSAGE);break;
                case "八宝粥":JOptionPane.showMessageDialog(null, "你选择了一罐八宝粥！", "提示信息", JOptionPane.INFORMATION_MESSAGE);break;
                case "果蔬乐园":JOptionPane.showMessageDialog(null, "你选择了一瓶果蔬乐园！", "提示信息", JOptionPane.INFORMATION_MESSAGE);break;
                default:JOptionPane.showMessageDialog(null, "已经投过币啦，快选择你想要的商品吧！", "提示信息", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    public static void main(String[] args) {
        yinpin frame = new yinpin();
        frame.setTitle("自动售货机");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
*/
