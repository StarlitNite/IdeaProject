package ButtonAct;


import Decorator.Component;
import Decorator.ConcretComponent;
import Decorator.ConcreteDecorator;
import Singleton.OrderNo;
import factory.*;
import observer.*;
import state.Context;
import state.HasMoney;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1 extends JFrame{


    Context context = new Context();
    public JLabel jlb = new JLabel();
    ConcreteSubject cs = new ConcreteSubject();
    ConcreteObserver co = new ConcreteObserver();
    asmSub as = new asmSub();
    bbzSub bs = new bbzSub();
    btlSub bts = new btlSub();
    coffeeSub cfs = new coffeeSub();
    colaSub cos = new colaSub();
    gslySub gs = new gslySub();
    jdlSub js = new jdlSub();
    nfSub ns = new nfSub();
    spriteSub ss = new spriteSub();

    public Button1(){
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
        //添加观察者
        cos.register(b1);
        ss.register(b2);
        cfs.register(b3);
        ns.register(b4);
        as.register(b5);
        bts.register(b6);
        js.register(b7);
        bs.register(b8);
        gs.register(b9);
        // 没货时 notify   循环判断每个物品的余量
        cos.cojudge();
        ss.spjudge();
        cfs.cfjudge();
        ns.nfjudge();
        as.asmjudge();
        bts.btljudge();
        js.jdljudge();
        bs.bbzjudge();
        gs.gsjudge();



//        b1.addActionListener(new MoneyListener());

        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(p1,BorderLayout.CENTER);

        container.add(p2,BorderLayout.WEST);
        /*//创建容器
        Container container =getContentPane();
        container.setLayout(new BorderLayout());
        //创建面板1
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(4,3));
        panel1.add(new JButton("可乐"));
        panel1.add(new JButton("雪碧"));
        panel1.add(new JButton("雀巢咖啡"));
        panel1.add(new JButton("农夫山泉"));
        panel1.add(new JButton("阿萨姆奶茶"));
        panel1.add(new JButton("宝特力矿泉水"));
        panel1.add(new JButton("佳得乐运动饮料"));
        panel1.add(new JButton("八宝粥"));
        panel1.add(new JButton("果蔬乐园"));
        //panel2把panel1的网格布局放入自己的边框布局内
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
//      panel2.add(new JTextField("自助贩卖机"),BorderLayout.NORTH);
        panel2.add(panel1,BorderLayout.CENTER);*/

        //右侧投币口面板
        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());

        //补货
        JButton factory = new JButton("补充商品");
        factory.addActionListener(new factoryListener());
        //下单
        JButton Order = new JButton("购买");
        Order.addActionListener(new OrderListener());

        //投币
        //先用B的写一个显示，然后再用G写投币的按钮，叠加
        JPanel p4 = new JPanel(new GridLayout(1, 3));
        JButton Money1 = new JButton("5元");
        JButton Money2 = new JButton("10元");
        JButton Money3 = new JButton("20元");
        p4.add(Money1);
        p4.add(Money2);
        p4.add(Money3);
        Money1.addActionListener(new MoneyListener());
        Money2.addActionListener(new MoneyListener());
        Money3.addActionListener(new MoneyListener());
        JButton Repay = new JButton("退币");
        Repay.addActionListener(new MoneyListener());

//选择冷热
        JButton Fun = new JButton("冷饮");
        JButton Fun1 = new JButton("热饮");
        Fun.addActionListener(new FuncationListener());
        Fun1.addActionListener(new FuncationListener());
        JPanel p5 = new JPanel(new GridLayout(1, 3));
        p5.add(Fun);
        p5.add(Fun1);
        p5.add(Order);
        //取货口
        JButton Good = new JButton("取货口");
        Good.addActionListener(new GoodListener());

        p3.add(factory,BorderLayout.EAST);
        p3.add(p5,BorderLayout.SOUTH);
        p3.add(Repay,BorderLayout.WEST);
        p3.add(p4,BorderLayout.CENTER);
        p3.add(jlb,BorderLayout.NORTH);
        container.add(p2,BorderLayout.WEST);
        container.add(p3,BorderLayout.EAST);
        container.add(Good,BorderLayout.SOUTH);

       /* Context con = new Context(20);
        con.InsertMoney();
        con.ChooseGoods();
        con.OutGoods();
        con.OutMoney();
        con.setState(con.HasMoney);
        con.InsertMoney();*/

        //界面上部文字
        //JTextField jtext = new JTextField("自助贩卖机");
        JLabel jl = new JLabel("自助贩卖机");
        //jtext.setHorizontalAlignment(JTextField.CENTER);
        jl.setHorizontalAlignment(JLabel.CENTER);
        container.add(jl,BorderLayout.NORTH);



    }

    //投币按钮
    class MoneyListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()){
                case "5元":context.InsertMoney(5);/* Context con1 = new Context(5); con1.InsertMoney(5);con1.ChooseGoods();con1.OutGoods();con1.OutMoney();*/ break;
                case "10元":context.InsertMoney(10);/*Context con2 = new Context(10); con2.InsertMoney(10);con2.ChooseGoods();con2.OutGoods();con2.OutMoney();*/break;
                case "20元":context.InsertMoney(20);/*Context con3 = new Context(20); con3.InsertMoney(20);con3.ChooseGoods();con3.OutGoods();con3.OutMoney();*/break;
                case "退币":context.OutMoney();
                /*default: System.out.println("您尚未投币");JOptionPane.showMessageDialog(null, "您尚未投币！", "提示信息", JOptionPane.INFORMATION_MESSAGE);*/
            }
        }
    }

    //选择饮品按钮
    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

                switch (e.getActionCommand()){
                    case "可乐":context.ChooseGoods(new cola().getName(),new cola().getPrice(),new cola().getNum());jlb.setText((new cola().toString()));/*JOptionPane.showMessageDialog(null, "你选择了一听可乐！", "提示信息", JOptionPane.INFORMATION_MESSAGE);*/ break;
                    case "雪碧":context.ChooseGoods(new sprite().getName(),new sprite().getPrice(),new sprite().getNum());jlb.setText((new sprite().toString()));/*JOptionPane.showMessageDialog(null, "你选择了一瓶雪碧！", "提示信息", JOptionPane.INFORMATION_MESSAGE);*/break;
                    case "雀巢咖啡":context.ChooseGoods(new coffee().getName(),new coffee().getPrice(),new coffee().getNum());jlb.setText((new coffee().toString()));/*JOptionPane.showMessageDialog(null, "你选择了一罐雀巢咖啡！", "提示信息", JOptionPane.INFORMATION_MESSAGE);*/break;
                    case "农夫山泉":context.ChooseGoods(new nF().getName(),new nF().getPrice(),new nF().getNum());jlb.setText((new nF().toString()));/*JOptionPane.showMessageDialog(null, "你选择了一瓶农夫山泉！", "提示信息", JOptionPane.INFORMATION_MESSAGE);*/break;
                    case "阿萨姆奶茶":context.ChooseGoods(new asm().getName(),new asm().getPrice(),new asm().getNum());jlb.setText((new asm().toString()));/*JOptionPane.showMessageDialog(null, "你选择了一瓶阿萨姆奶茶！", "提示信息", JOptionPane.INFORMATION_MESSAGE);*/break;
                    case "宝特力矿泉水":context.ChooseGoods(new btl().getName(),new btl().getPrice(),new btl().getNum());jlb.setText((new btl().toString()));/*JOptionPane.showMessageDialog(null, "你选择了一桶宝特力矿泉水！", "提示信息", JOptionPane.INFORMATION_MESSAGE);*/break;
                    case "佳得乐运动饮料":context.ChooseGoods(new jdl().getName(),new jdl().getPrice(),new jdl().getNum());jlb.setText((new jdl().toString()));/*JOptionPane.showMessageDialog(null, "你选择了一瓶佳得乐运动饮料！", "提示信息", JOptionPane.INFORMATION_MESSAGE);*/break;
                    case "八宝粥":context.ChooseGoods(new bbz().getName(),new bbz().getPrice(),new bbz().getNum());jlb.setText((new bbz().toString()));/*JOptionPane.showMessageDialog(null, "你选择了一罐八宝粥！", "提示信息", JOptionPane.INFORMATION_MESSAGE);*/break;
                    case "果蔬乐园":context.ChooseGoods(new gsly().getName(),new gsly().getPrice(),new gsly().getNum());jlb.setText((new gsly().toString()));/*JOptionPane.showMessageDialog(null, "你选择了一瓶果蔬乐园！", "提示信息", JOptionPane.INFORMATION_MESSAGE);*/break;
                    default:JOptionPane.showMessageDialog(null, "已经投过币啦，快选择你想要的商品吧！", "提示信息", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

    //功能键
    class FuncationListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand()=="冷饮"){
                Component component = new ConcreteDecorator(new ConcretComponent());
                component.ice();
            }else if (e.getActionCommand()=="热饮"){
                Component component = new ConcreteDecorator(new ConcretComponent());
                component.hot();
            }
        }
    }

    //出货按钮
    class GoodListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            context.OutGoods();
        }
    }

    //补充货品订单按钮
    class factoryListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                //Button1.this.dispose();
                new GoodsAdd("自动贩卖机系统");

            }catch (Exception b){
                System.out.println(b.getMessage());
            }
        }
    }
    //创建订单按钮
     class OrderListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            OrderNo no1, no2;
            no1 = OrderNo.getInstance();
        }
    }




    public static void main(String[] args) {
        Button1 frame = new Button1();
        frame.setTitle("自动售货机");
        frame.setSize(720,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
