package observer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
//主题
public interface Subject {

    //添加观察者
    public void register(JButton button);

    //删除观察者
    public void unregister(JButton button);

    //通知观察者更新
    public void notifyObserver();
}
