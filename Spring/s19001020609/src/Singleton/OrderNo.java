package Singleton;

import factory.*;
import state.Context;
import state.GiveGoods;
import state.HasMoney;

import javax.swing.*;

public class OrderNo {
    public static OrderNo instance = null;
    private int No = 1;
    public static String name;
    public static int muchcount = 0;//买完东西后剩余的钱
    public static int count = 0;//相应物品的钱数
    public static int num = 0;


    public OrderNo() {
    }

    public static OrderNo getInstance(){
        Context context=new Context();
        if (instance == null){
            System.out.println("获取订单");

            muchcount = HasMoney.muchcount-count;//减去饮品需要的钱数，再返回给，GiveGoods，结束
            if (muchcount<0){
                JOptionPane.showMessageDialog(null, "金额不足，无法购买！", "信息", JOptionPane.INFORMATION_MESSAGE);
            }else{
                GiveGoods gg = new GiveGoods(context);
                gg.muchMoney = muchcount;
                if (name .equals("可乐")){
                    cola.num-=1;
//                    num-=1;//减去饮品的数量
                }else if (name.equals("阿萨姆奶茶")){
                    asm.num-=1;
                }else if (name.equals("佳得乐运动饮料")){
                    jdl.num-=1;
                }else if (name.equals("八宝粥")){
                    bbz.num-=1;
                }else if (name.equals("雀巢咖啡")){
                    coffee.num-=1;
                }else if (name.equals("果蔬乐园")){
                    gsly.num-=1;
                }else if (name.equals("宝特力矿泉水")){
                    btl.num-=1;
                }else if (name.equals("农夫山泉")){
                    nF.num-=1;
                }else if (name.equals("雪碧")){
                    sprite.num-=1;
                }

                instance = new OrderNo();
                JOptionPane.showMessageDialog(null, "购买成功！请在取货口处取得您的商品", "信息", JOptionPane.INFORMATION_MESSAGE);
                System.out.println(instance.getNo());
            }

        }
        else {
            System.out.println("重复下单且与上一个未交易的订单相同，获取旧订单号");
            System.out.println(instance.getNo());
        }
        return instance;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        this.No = no;
    }

    public OrderNo(int no) {
        this.No = no;
    }
}
