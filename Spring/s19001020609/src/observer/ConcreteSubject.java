package observer;

import Singleton.OrderNo;
import state.Context;
import state.GiveGoods;
import state.HasMoney;

import javax.swing.*;
import java.util.ArrayList;

/*具体主题类*/

public class ConcreteSubject implements Subject{


    public static int num = 0;
    public static String name = null;
    public static int price = 0;

    public void judge(){
        Context context=new Context();
        if (num>0){

            JOptionPane.showMessageDialog(null, "您已选择"+name+"价格  "+price+"元", "信息", JOptionPane.INFORMATION_MESSAGE);
            context.setState(context.GiveGoods);
            GiveGoods gg = new GiveGoods(context);
            gg.goods = name;

            OrderNo orderNo = new OrderNo();
            orderNo.count = price;
            orderNo.num = num;
        }else {
            context.setState(context.NoGoods);
            ConcreteObserver co = new ConcreteObserver();
            co.noGoods(name);
        }
    }

    /* public ConcreteSubject() {
        observers = new ArrayList<Observer>();
    }*/

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {

        }
    }





}
