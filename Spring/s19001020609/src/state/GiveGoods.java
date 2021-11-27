package state;

import ButtonAct.Button1;
import Singleton.OrderNo;
import observer.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiveGoods implements State ,Cloneable {
    private final Context context;
    public static String goods = null;
    public static int muchMoney = 0;

    asmSub as = new asmSub();
    bbzSub bs = new bbzSub();
    btlSub bts = new btlSub();
    coffeeSub cfs = new coffeeSub();
    colaSub cos = new colaSub();
    gslySub gs = new gslySub();
    jdlSub js = new jdlSub();
    nfSub ns = new nfSub();
    spriteSub ss = new spriteSub();


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
        int res = JOptionPane.showConfirmDialog(null, "是否需要继续购买物品","信息" , JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION){
            if (muchMoney>0){
                HasMoney.muchcount = muchMoney;
                System.out.println(HasMoney.muchcount+"GiveGoods.OutGoods");
                context.setState(context.HasMoney);
            }else {
                JOptionPane.showMessageDialog(null, "余额不足，请投币", "信息", JOptionPane.INFORMATION_MESSAGE);
                context.setState(context.NoMoney);
            }

        }else {
            JOptionPane.showMessageDialog(null, "请您退币", "信息", JOptionPane.INFORMATION_MESSAGE);
        }



        cos.cojudge();
        ss.spjudge();
        cfs.cfjudge();
        ns.nfjudge();
        as.asmjudge();
        bts.btljudge();
        js.jdljudge();
        bs.bbzjudge();
        gs.gsjudge();

        OrderNo.instance = null;
    }

    @Override
    public int OutMoney() {

        System.out.println("已退币"+muchMoney);
        JOptionPane.showMessageDialog(null, "已退币"+muchMoney+"元", "信息", JOptionPane.INFORMATION_MESSAGE);
        HasMoney.icount = 0;
        context.setState(context.NoMoney);
        OrderNo.instance = null;
        return 0;

    }



}
