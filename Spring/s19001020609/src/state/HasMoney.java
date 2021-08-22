package state;

import Singleton.OrderNo;
import observer.ConcreteObserver;
import observer.ConcreteSubject;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public class HasMoney implements State{
    private final Context context;

    public static int icount;//总币数
    public static int muchcount;//剩余币数


    public HasMoney(Context context) {
        this.context = context;
    }

    @Override
    public int OutMoney() {

        System.out.println("已退币"+muchcount+"元");
        JOptionPane.showMessageDialog(null, "已退币"+muchcount+"元", "信息", JOptionPane.INFORMATION_MESSAGE);
        icount = 0;
        context.setState(context.NoMoney);
        OrderNo.instance = null;
        return 0;
    }

    @Override
    public void InsertMoney(int count) {
        icount += count;
        muchcount = icount;
        System.out.println("您已投入"+icount+"元,请选择物品");
        JOptionPane.showMessageDialog(null, "您已投入"+icount+"元,请选择物品", "信息", JOptionPane.INFORMATION_MESSAGE);
        /*if (muchcount == icount){

        }else {
            System.out.println("您已投入"+muchcount+"元,请选择物品");
            JOptionPane.showMessageDialog(null, "您已投入"+muchcount+"元,请选择物品", "信息", JOptionPane.INFORMATION_MESSAGE);
        }*/


    }


    @Override
    public void ChooseGoods(String name,int price,int num) {
        //已选择物品，将状态设置到GiveGoods
        System.out.println(muchcount+"元HasMoney.ChooserGoods");
        context.setState(context.GiveGoods);//设置为出货状态
        ConcreteSubject cs = new ConcreteSubject();
        cs.num = num;
        cs.name = name;
        cs.price = price;
        cs.muchmoney = muchcount;
        cs.judge();//判断是否有货

        System.out.println("您已选择"+name);
        System.out.println("价格"+price+"元");

        //context.setState(context.GiveGoods);//设置为出货状态
        //System.out.println(num);
       /* GiveGoods gg = new GiveGoods(context);
        gg.goods = name;

        //获取订单时，获取货物价格和货物数量
        OrderNo orderNo = new OrderNo();
        orderNo.count = price;
        orderNo.num = num;*/



        /*if(num>0){
            System.out.println("您已选择"+name);
            System.out.println("价格"+price+"元");
            JOptionPane.showMessageDialog(null, "您已选择"+name+"价格  "+price+"元", "信息", JOptionPane.INFORMATION_MESSAGE);
            context.setState(context.GiveGoods);//设置为出货状态
            //System.out.println(num);
            GiveGoods gg = new GiveGoods(context);
            gg.goods = name;


        }else {
            context.setState(context.NoGoods);
            ConcreteObserver co = new ConcreteObserver();
            co.noGoods(name);
            *//*NoGoods gg = new NoGoods(context);
            gg.goods = name;*//*
        }*/




    }

    @Override
    public void OutGoods() {
        System.out.println("请先选择您想要的商品");
        JOptionPane.showMessageDialog(null, "请先选择您想要的商品", "信息", JOptionPane.INFORMATION_MESSAGE);
    }


}
