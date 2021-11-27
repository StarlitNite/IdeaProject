package state;

import javax.swing.*;

public class NoMoney implements State {


    private final Context context;

    public NoMoney(Context context) {
        this.context = context;
    }

    @Override
    public void InsertMoney(int count) {
        System.out.println("尚未投币,请投币!");
        JOptionPane.showMessageDialog(null, "请投币！", "信息", JOptionPane.INFORMATION_MESSAGE);
    }


    public void ChooseGoods(String name,int price,int num) {
        HasMoney.icount = 0;
        JOptionPane.showMessageDialog(null, "请投币后再选择商品！", "信息", JOptionPane.INFORMATION_MESSAGE);

    }

    @Override
    public void OutGoods() {
        JOptionPane.showMessageDialog(null, "尚未投币，无法出货", "信息", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public int OutMoney() {
        HasMoney.icount = 0;
        JOptionPane.showMessageDialog(null, "尚未投币，无法退币", "信息", JOptionPane.INFORMATION_MESSAGE);
        return 0;
    }
}
