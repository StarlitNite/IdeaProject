package observer;

import javax.swing.*;
import java.awt.*;

public class bbzOb implements Observer{
    @Override
    public void noGoods(String name) {

    }

    @Override
    public void update(JButton button) {
        new Button().setBackground(Color.red);
    }
}
