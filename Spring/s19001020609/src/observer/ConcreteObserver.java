package observer;

import ButtonAct.Button1;
import state.Context;

import javax.swing.*;
import java.awt.*;

public class ConcreteObserver implements Observer{
    //Context context=new Context();
    @Override
    public void noGoods(String name) {
        System.out.println(name+"没货了");
        JOptionPane.showMessageDialog(null, name+"没货了,请您退币！", "信息", JOptionPane.INFORMATION_MESSAGE);
        //context.setState(context.HasMoney);

    }

    @Override
    public void update(JButton button) {
        new Button().setBackground(Color.red);

    }

    @Override
    public void reup(JButton button) {

    }



   /* @Override
    public void del() {

    }

    @Override
    public void ad() {

    }*/
    //9个按钮，需要9个主题？每个主题有两个观察者，一个是画板，一个是状态  当num=0的时候，通知售货机按钮和画板显示 没货
}
