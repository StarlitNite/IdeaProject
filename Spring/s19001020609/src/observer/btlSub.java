package observer;

import factory.btl;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class btlSub implements Subject{
    public ArrayList<JButton> observers = new ArrayList<>();

    public void btljudge(){
        if ( new btl().getNum()==0){
            notifyObserver();
        }
    }
    @Override
    public  void register(JButton button) {
        observers.add(button);
    }

    @Override
    public void unregister(JButton button) {
        observers.add(button);
    }

    @Override
    public void notifyObserver() {
        for (JButton observer: observers) {
            observer.update(new Button().getGraphics());
        }
    }
}
