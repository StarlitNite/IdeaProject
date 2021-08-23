package observer;

import factory.asm;
import factory.btl;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class asmSub implements Subject{
    public ArrayList<JButton> observers = new ArrayList<>();
    @Override
    public  void register(JButton button) {
        observers.add(button);
    }

    @Override
    public void unregister(JButton button) {
        observers.add(button);
    }

    public void asmjudge(){
        if ( new asm().getNum()==0){
            notifyObserver();
        }
    }

    @Override
    public void notifyObserver() {
        for (JButton observer: observers) {
            System.out.println(observer);
            observer.update(new Button().getGraphics());
        }
    }
}
