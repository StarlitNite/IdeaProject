package state;

import Singleton.OrderNo;

import javax.swing.*;

public class GiveGoods implements State ,Cloneable {
    private final Context context;
    public static String goods = null;


    public GiveGoods(Context context) {
        this.context = context;
    }

    @Override
    public void InsertMoney(int count) {
    }

    @Override
    public void ChooseGoods(String name,int price,int num) {

    }
//    public void setGoods(String name) {
//        goods = name;
//    }

    public void setGoods() {
        this.goods = goods;
    }

    public String getGoods() {
        return goods;
    }

    @Override
    public void OutGoods() {

        System.out.println("正在出货，请稍后!");
        JOptionPane.showMessageDialog(null, "正在出货，请稍后!", "信息", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("您已获得"+goods);
        JOptionPane.showMessageDialog(null, "您已获得"+goods, "信息", JOptionPane.INFORMATION_MESSAGE);
        OrderNo.instance = null;
    }

    @Override
    public int OutMoney() {

        System.out.println("已退币"+OrderNo.muchcount);
        JOptionPane.showMessageDialog(null, "已退币"+OrderNo.muchcount+"元", "信息", JOptionPane.INFORMATION_MESSAGE);
        return 0;

    }

}
