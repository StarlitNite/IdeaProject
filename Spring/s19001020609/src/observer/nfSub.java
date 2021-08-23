package observer;

import factory.btl;
import factory.nF;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class nfSub implements Subject{
    public ArrayList<JButton> observers = new ArrayList<>();
    @Override
    public  void register(JButton button) {
        observers.add(button);
    }

    @Override
    public void unregister(JButton button) {
        observers.add(button);
    }
    public void nfjudge(){
        if ( new nF().getNum()==0){
            notifyObserver();
        }
    }
    @Override
    public void notifyObserver() {
        for (JButton observer: observers) {
            observer.update(new Button().getGraphics());
        }
    }
}
