package Decorator;

import javax.swing.*;

public class ConcretComponent implements Component{

    @Override
    public void ice() {
        JOptionPane.showMessageDialog(null, "已为您冷藏", "信息", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("已为您冷藏。。");
    }

    @Override
    public void hot() {
        JOptionPane.showMessageDialog(null,"已为您加热" , "信息", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("已为您加热。。");
    }

}
