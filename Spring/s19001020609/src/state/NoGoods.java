package state;

import Singleton.OrderNo;
import observer.ConcreteObserver;

import javax.swing.*;

public class NoGoods implements State {
    private final Context context;
    public static String goods = null;

    public NoGoods(Context context) {
        this.context = context;
    }

    @Override
    public void InsertMoney(int count) {

    }

    @Override
    public void ChooseGoods(String name,int price,int num) {
        /*ConcreteObserver co = new ConcreteObserver();
        co.noGoods(goods);*/

    }

    @Override
    public void OutGoods() {

    }

    @Override
    public int OutMoney() {
        System.out.println("已退币2");
        JOptionPane.showMessageDialog(null, "已退币2", "信息", JOptionPane.INFORMATION_MESSAGE);
        OrderNo.instance = null;
        return 0;

    }
}
