package observer;

import javax.swing.*;

public class ConcreteObserver implements Observer{
    @Override
    public void noGoods(String name) {
        System.out.println(name+"没货了");
        JOptionPane.showMessageDialog(null, name+"没货了", "信息", JOptionPane.INFORMATION_MESSAGE);
    }

   /* @Override
    public void del() {

    }

    @Override
    public void ad() {

    }*/
    //9个按钮，需要9个主题？每个主题有两个观察者，一个是画板，一个是状态  当num=0的时候，通知售货机按钮和画板显示 没货
}
