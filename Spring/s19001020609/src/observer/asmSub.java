package observer;

import factory.asm;
import factory.btl;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class asmSub implements Subject{
    public static ArrayList<JButton> observers = new ArrayList<>();
    @Override
    public  void register(JButton button) {
        observers.add(button);
    }

    @Override
    public void unregister(JButton button) {
        observers.add(button);
    }

    public void asmjudge(){
        if (  asm.num==0){
            notifyObserver();
        }else {
            unno();
        }
    }

    @Override
    public void notifyObserver() {
        for (JButton observer: observers) {
            System.out.println(observer);
            new asmOb().update(observer);
        }
    }

    @Override
    public void unno() {
        for (JButton observer: observers) {

            new asmOb().reup(observer);
        }

    }
}
