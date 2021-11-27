package factory;

import observer.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoodsAdd extends JFrame {
    asmSub as = new asmSub();
    bbzSub bs = new bbzSub();
    btlSub bts = new btlSub();
    coffeeSub cfs = new coffeeSub();
    colaSub cos = new colaSub();
    gslySub gs = new gslySub();
    jdlSub js = new jdlSub();
    nfSub ns = new nfSub();
    spriteSub ss = new spriteSub();


    JLabel factory = new JLabel("工厂名");
    JTextField text = new JTextField(30);
    JButton add = new JButton("添加商品");

    public GoodsAdd(String name){
        JPanel panel = new JPanel();
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setSize(600, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle(name);
        this.setVisible(true);

        add.addActionListener(new addListener());

        this.add(factory);
        this.add(text);
        this.add(add);
    }

    class addListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
            add add;
            DrinkFactory dFactory;
            String cName = "factory.";
            String str_factory = text.getText();
            cName = cName + str_factory;
            Class c =Class.forName(cName);
            Object obj = c.newInstance();
            dFactory = (DrinkFactory) obj;
            add = (add) dFactory.MakeDrink();
            add.add();

                cos.cojudge();
                ss.spjudge();
                cfs.cfjudge();
                ns.nfjudge();
                as.asmjudge();
                bts.btljudge();
                js.jdljudge();
                bs.bbzjudge();
                gs.gsjudge();
            } catch (Exception b) {
                System.out.println(b.getMessage()+"错误信息");
            }

        }
    }
}
