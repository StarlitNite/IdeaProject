package observer;

import java.util.ArrayList;
import java.util.List;
//主题
public interface Subject {
    public ArrayList<Observer> observers = new ArrayList<>();
    //添加观察者
    public void register(Observer observer);

    //删除观察者
    public void unregister(Observer observer);

    //通知观察者更新
    public void notifyObserver();
}
