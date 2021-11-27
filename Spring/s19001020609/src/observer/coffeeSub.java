package observer;

import factory.btl;
import factory.coffee;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class coffeeSub implements Subject{
    public static ArrayList<JButton> observers = new ArrayList<>();
    @Override
    public  void register(JButton button) {
        observers.add(button);
    }

    @Override
    public void unregister(JButton button) {
        observers.add(button);
    }
    public void cfjudge(){
        if ( coffee.num==0){
            notifyObserver();
        }else {
            unno();
        }
    }
    @Override
    public void notifyObserver() {
        for (JButton observer: observers) {
            observer.update(new Button().getGraphics());
        }
    }

    @Override
    public void unno() {
        for (JButton observer: observers) {

            new coffeeOb().reup(observer);
        }
    }
}
