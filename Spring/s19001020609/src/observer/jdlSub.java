package observer;

import factory.btl;
import factory.jdl;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class jdlSub implements Subject{
    public static ArrayList<JButton> observers = new ArrayList<>();
    @Override
    public  void register(JButton button) {
        observers.add(button);
    }

    @Override
    public void unregister(JButton button) {
        observers.add(button);
    }
    public void jdljudge(){
        if (  jdl.num==0){
            notifyObserver();
        }else if(jdl.num>0) {
            unno();
        }
    }
    @Override
    public void notifyObserver() {
        for (JButton observer: observers) {
            /*observer.update(new Button().getGraphics());*/
            new jdlOb().update(observer);
        }
    }

    @Override
    public void unno() {
        for (JButton observer: observers) {

            new jdlOb().reup(observer);
        }
    }
}
