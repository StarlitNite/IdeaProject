package factory;

import javax.swing.*;
import java.awt.*;

public class asm extends Drink implements DrinkFactory,add {

    private static int num = 10;
    private int price = 5;
    private String name = "阿萨姆奶茶";

    public int getPrice() {

        return super.price = 5;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getName() {
        return "阿萨姆奶茶";
    }

    @Override
    public DrinkFactory MakeDrink() {
        return new asm();
    }

    @Override
    public String toString() {
        return
                "价格:" + price +
                "元, 商品名:" + name ;
    }

    @Override
    public void add() {
        System.out.println("往贩卖机中加入了一瓶阿萨姆奶茶。。。");
        num+=1;
        System.out.println("贩卖机中剩余"+num+"瓶"+name);
        JOptionPane.showInternalConfirmDialog(null,"please choose one", "information", JOptionPane.YES_NO_CANCEL_OPTION,  JOptionPane.INFORMATION_MESSAGE);
    }
}
