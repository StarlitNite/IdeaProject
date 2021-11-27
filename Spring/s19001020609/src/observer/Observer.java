package observer;

import javax.swing.*;

//观察者
public interface Observer {
    public void noGoods(String name);

    public void update(JButton button);

    public void reup(JButton button);
}
