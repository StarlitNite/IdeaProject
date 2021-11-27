package observer;

import javax.swing.*;
import java.awt.*;

public class coffeeOb implements Observer{
    @Override
    public void noGoods(String name) {

    }

    @Override
    public void update(JButton button) {
        button.setBackground(Color.red);
    }

    @Override
    public void reup(JButton button) {
        button.setBackground(null);
    }
}
