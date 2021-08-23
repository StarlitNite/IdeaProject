package observer;

import factory.btl;
import factory.cola;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class colaSub implements Subject{
    public ArrayList<JButton> observers = new ArrayList<>();
    @Override
    public  void register(JButton button) {
        observers.add(button);
    }

    @Override
    public void unregister(JButton button) {
        observers.add(button);
    }
    public void cojudge(){
        if ( new cola().getNum()==0){
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
