package observer;

import Singleton.OrderNo;
import state.Context;
import state.GiveGoods;
import state.HasMoney;
import state.State;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/*具体主题类,总*/

public class ConcreteSubject implements Subject {


    public static int num = 0;
    public static String name = null;
    public static int price = 0;
    public static int muchmoney = 0;



    public void judge(){
        Context context=new Context();

        if (num>0){

            //context.setState(context.GiveGoods);
            JOptionPane.showMessageDialog(null, "您已选择"+name+"价格  "+price+"元", "信息", JOptionPane.INFORMATION_MESSAGE);
            //传name给GiveGoods中的goods
            GiveGoods gg = new GiveGoods(context);
            gg.goods = name;


            OrderNo orderNo = new OrderNo();
            orderNo.name = name;
            orderNo.count = price;
            orderNo.num = num;



        }else {
            context.setState(context.NoGoods);
            ConcreteObserver co = new ConcreteObserver();
            co.noGoods(name);

        }
    }

    public ArrayList<JButton> observers = new ArrayList<>();


    @Override
    public void register(JButton button) {
        observers.add(button);
    }

    @Override
    public void unregister(JButton button) {
        observers.remove(button);
    }


    @Override
    public void notifyObserver() {
    }

    @Override
    public void unno() {

    }


}
